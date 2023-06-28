package com.example.toy_servlet.controlls;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toy_servlet.Daos.PollsDao;

@WebServlet(urlPatterns = "/StatisticsServlet")
public class StatisticsServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PollsDao pollsDao = new PollsDao();
            int total = pollsDao.replyCount();
            
            request.setAttribute("TOTAL", total);  

            response.setContentType("text/html;charset=UTF-8");
            // 다음 파일 호출  
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/statistics.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
