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
            String contents = "<!DOCTYPE html>\r\n" + //
                    "<html lang=\"en\">\r\n" + //
                    "<head>\r\n" + //
                    "    <meta charset=\"UTF-8\">\r\n" + //
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                    "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\">\r\n" + //
                    "    <title>\uD68C\uC6D0\uAD00\uB9AC</title>\r\n" + //
                    "</head>\r\n" + //
                    "<body>\r\n" + //
                    "    <div class=\"container justify-content-center mt-5\">\r\n" + //
                    "        <form action=\"./membersinfo.html\">\r\n" + //
                    "        <table class=\"table table-bordered  table-hover\">\r\n" + //
                    "            <thead>\r\n" + //
                    "                <tr>\r\n" + //
                    "                  <th>\uC544\uC774\uB514</th>\r\n" + //
                    "                  <th>\uC774\uB984</th>\r\n" + //
                    "                  <th>\uC0C1\uC138\uC815\uBCF4</th>\r\n" + //
                    "                </tr>\r\n" + //
                    "            </thead>\r\n" + //
                    "            <tbody>\r\n" + //
                    "                <tr>\r\n" + //
                    "                  <td>aaa999</td>\r\n" + //
                    "                  <td>\uD64D\uAE38\uB3D9</td>\r\n" + //
                    "                  <td><button type=\"submit\" class=\"btn  btn-primary btn-sm\">\uBCF4\uAE30</button></td>\r\n" + //
                    "                </tr>\r\n" + //
                    "                <tr>\r\n" + //
                    "                  <td>bbb888</td>\r\n" + //
                    "                  <td>\uC7A5\uAE38\uC0B0</td>\r\n" + //
                    "                  <td><button type=\"submit\" class=\"btn  btn-primary btn-sm\">\uBCF4\uAE30</button></td>\r\n" + //
                    "                </tr>\r\n" + //
                    "                <tr>\r\n" + //
                    "                    <td>ccc777</td>\r\n" + //
                    "                    <td>\uC2E0\uC0AC\uC784\uB2F9</td>\r\n" + //
                    "                    <td><button type=\"submit\" class=\"btn  btn-primary btn-sm\">\uBCF4\uAE30</button></td>\r\n" + //
                    "                  </tr>\r\n" + //
                    "                  <tr>\r\n" + //
                    "                    <td>ddd666</td>\r\n" + //
                    "                    <td>\uAE40\uCCA0\uC218</td>\r\n" + //
                    "                  <td><button type=\"submit\" class=\"btn  btn-primary btn-sm\">\uBCF4\uAE30</button></td>\r\n" + //
                    "                  </tr>\r\n" + //
                    "        </table>\r\n" + //
                    "        </form> \r\n" + //
                    "    </div>\r\n" + //
                    "</body>\r\n" + //
                    "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n" + //
                    "</html>";
        
            
            PollsDao pollsDao = new PollsDao();
            ArrayList membersList = new ArrayList<>();
            membersList = pollsDao.SelectMembers();
            for (int i =0; i < membersList.size(); i= i+1 ) {
                HashMap members = new HashMap<>();
                members = (HashMap) membersList.get(i);
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
