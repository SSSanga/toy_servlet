package com.example.toy_servlet.controlls;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/MainServlet")
public class MainServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
             response.setContentType("text/html;charset=UTF-8");
            // 다음 파일 호출  
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/main.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
