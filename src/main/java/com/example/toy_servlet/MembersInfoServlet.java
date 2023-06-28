package com.example.toy_servlet;

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

@WebServlet(urlPatterns = "/MembersInfoServlet")
public class MembersInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {
        try {
            HashMap hashMap = new HashMap<>();
            String name = request.getParameter("name");
            PollsDao pollsDao = new PollsDao();
            ArrayList infor = new ArrayList();
            infor = pollsDao.InfoMembers(name);
    
            request.setAttribute("name", name);   
            request.setAttribute("infor", infor);

            response.setContentType("text/html;charset=UTF-8");
            // 다음 파일 호출
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/membersinfo.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
