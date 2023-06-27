package com.example.toy_servlet.Poll;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toy_servlet.Daos.PollsDao;

@WebServlet(urlPatterns = "/surveyServlet")
public class surveyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String contents = "";
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            HashMap hashmap = new HashMap<>();

            PollsDao pollsDao = new PollsDao();
            ArrayList arrayquest = new ArrayList();
            arrayquest = pollsDao.SelectQuest();
            for (int second = 0; second < arrayquest.size(); second = second + 1) {
                hashmap = (HashMap) arrayquest.get(second);
                contents = contents + (String) hashmap.get("QUESTIONS");
                
                printWriter.println();
                ArrayList arraychoice = new ArrayList();
                arraychoice = pollsDao.selectAll(); // 답안=CHOICE 출력_HASHMAP으로 풀다
                for (int first = 0; first < arraychoice.size(); first = first + 1) {

                    hashmap = (HashMap) arraychoice.get(first);
                    contents = contents + (String) hashmap.get("CHOICE");

                }

            }

            printWriter.println(contents);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
