package com.example.toy_servlet.Polls;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.yaml.snakeyaml.error.YAMLException;

import com.example.toy_servlet.Daos.PollsDao;

@WebServlet(urlPatterns = "/MembersServlet")
public class MembersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PollsDao pollsDao = new PollsDao();
            ArrayList List = new ArrayList();
            List = pollsDao.SelectMembers();
            

            response.setContentType("text/html;charset=UTF-8");
            // 다음 파일 호출  
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/poll/members.jsp");
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
