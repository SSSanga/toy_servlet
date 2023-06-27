package com.example.toy_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/test")
public class test extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String con ="hi";
            PrintWriter printWriter = resp.getWriter();
            printWriter.println(con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
