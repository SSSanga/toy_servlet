package com.example.toy_servlet.Polls;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.toy_servlet.Daos.PollsDao;

@WebServlet(urlPatterns = "/MembersInfoServlet")
public class MembersInfoServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PollsDao pollsDao = new PollsDao();
            ArrayList membersList = new ArrayList();
            membersList = pollsDao.SelectMembers();
            
            request.setAttribute("membersList", membersList);

            response.setContentType("text/html;charset=UTF-8");
            //다음 파일 호출  
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Daos/PollsDao.java");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
