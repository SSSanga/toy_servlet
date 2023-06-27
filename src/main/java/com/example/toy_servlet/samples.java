package com.example.toy_servlet;

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

@WebServlet(urlPatterns = "/sampless")
public class samples extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String contents = "<!DOCTYPE html>\r\n" + //
                    "<html lang=\"en\">\r\n" + //
                    "\r\n" + //
                    "<head>\r\n" + //
                    "    <meta charset=\"UTF-8\">\r\n" + //
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + //
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                    "    <title>bootstrap_tables</title>\r\n" + //
                    "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\">\r\n"
                    + //
                    "</head>\r\n" + //
                    "\r\n" + //
                    "<body>\r\n" + //
                    "    <div class=\"container\">\r\n" + //
                    "        <table class=\"table table-bordered table-hover\">\r\n" + //
                    "            <thead>\r\n" + //
                    "                <tr>\r\n" + //
                    "<thead>\r\n" + //
                    "<tr>\r\n" + //
                    "<th colspan = \"2\">COMPANY</th>\r\n" + //
                    "<th colspan = \"2\">COMPANY_ID</th>\r\n" + //
                    "</tr>\r\n" + //
                    "</thead>\r\n";
                    PollsDao pollsDao = new PollsDao();
                    ArrayList pollquest = new ArrayList();
                    for (int i = 0; i < pollquest.size(); i = i+1){
                        HashMap hashMap = new HashMap<>();
                        hashMap = (HashMap) pollquest.get(i);
                        contents = contents + "<tr>\r\n" + //
                        "<td colspan = \"2\">" + hashMap.get("QUESTIONS") + "</td>\r\n" + //
                        "<td colspan = \"2\">" + hashMap.get("QUESTIONS_ID") + "</td>\r\n" + //
                        "</tr>\r\n"; //
                    }
                    contents = contents + 
                    "            </tbody>\r\n" + //
                    "        </table>\r\n" + //
                    "    </div>\r\n" + //
                    "</body>\r\n" + //
                    "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
                    + //
                    "\r\n" + //
                    "</html>";
                    response.setContentType("text/html;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            printWriter.println(contents);
            printWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("END");
    }
    
}
