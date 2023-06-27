package com.example.toy_servlet.Polls;

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

@WebServlet(urlPatterns = "/MembersServlet")
public class MembersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try { 
            String contents = "";
        
            
            PollsDao pollsDao = new PollsDao();
            ArrayList membersList = new ArrayList<>();
            membersList = pollsDao.SelectMembers();
            for (int i =0; i < membersList.size(); i= i+1 ) {
                HashMap hashMap = new HashMap<>();
                
            }


            response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            printWriter.println(contents); // 네트워크에 실어 보내는 부분
            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
