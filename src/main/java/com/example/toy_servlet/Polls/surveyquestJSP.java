package com.example.toy_servlet.Polls;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toy_servlet.Daos.PollsDao;

@WebServlet(urlPatterns = "/surveyquestJSP")
public class surveyquestJSP extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String contents = "";
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            HashMap hashquest = new HashMap<>();
            PollsDao pollsDao = new PollsDao();
            ArrayList arrayquest = new ArrayList<>();
            arrayquest = pollsDao.SelectQuest();
            // for (int second = 0; second < arrayquest.size(); second = second + 1) {
            // hashmap = (HashMap) arrayquest.get(second);
            // contents = contents + (String) hashmap.get("QUESTIONS"); // 질문1개 나오면 다음
            // selectAll로 넘어가서 CHOICE 출력한다.

            request.setAttribute("arrayquest", arrayquest);

            // printWriter.println();
            // ArrayList arraychoice = new ArrayList<>();
            // arraychoice = pollsDao.selectAll(); // 답안=CHOICE 출력_HASHMAP으로 풀다
            // // for (int first = 0; first < arraychoice.size(); first = first + 1) {

            // // hashmap = (HashMap) arraychoice.get(first);
            // // contents = contents + (String) hashmap.get("CHOICE");
            // request.setAttribute("arraychoice", arraychoice);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/poll/surveyquest.jsp");
            requestDispatcher.forward(request, response);
            // printWriter.println(contents);
            // printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
