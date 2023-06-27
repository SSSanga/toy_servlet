package com.example.toy_servlet.Poll;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toy_servlet.Daos.PollsDao;

@WebServlet (urlPatterns="/surveyServlet")
public class surveyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String contents="";

            PollsDao pollsDao=new PollsDao();
            ArrayList arrayquestion = new ArrayList();
            // arrayquestion=pollsDao.pollQuestion();
            for (int first = 0; first <arrayquestion.size();first = first +1){

            }
            
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            printWriter.println(contents);
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
