package com.example.toy_servlet.controlls;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.toy_servlet.Daos.PollsID_PW;

@WebServlet(urlPatterns = "/Login/CreateServlet")
public class LoginCreateServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {
            PollsID_PW pollsID_PW = new PollsID_PW();
            HashMap id_pw = pollsID_PW.selectAll();
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // display
            PrintWriter printWriter = response.getWriter();
            printWriter.println("<div>Create Session Servlets</div>"); // 네트워크에 println을 계속 쏴줌
            
            // login. JSessionID
            
            HttpSession httpSession = request.getSession(false); // 클라이언트의 상태에 따라 만들어낼지말지 결정함
            String usernameSession = (String) httpSession.getAttribute("username");
            if (httpSession != null && usernameSession != null) { // JSESSION 있음 : 로그인 되었다는 표시  /  = 해당되는 사항에 이미 서버에 똑같은게 있다.  해당 정보를 가져오기만 하면 됨
             
                printWriter.println("<div>username : "+usernameSession+"</div>");
            } else { // 없음 : 로그인
                httpSession = request.getSession();   //오류 방어 코드
                if (id_pw.containsKey(username)&&id_pw.get(username).equals(password)) { //
                    httpSession.setAttribute("username", username); 
                    httpSession.setAttribute("password", password);
                     response.sendRedirect("/surveyServletJSPing");  
                } else {
                    printWriter.println("<div>Faild</div>");
                     response.sendRedirect("/LoginPageServlet");
                }
            }

            printWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

