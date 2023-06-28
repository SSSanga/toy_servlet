<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.HashMap, java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <title></title>
</head>
<body>
    <div class="container justify-content-center mt-5">
        <table class="table table-bordered table-hover">
            <thead>
                
                  <th>질문</th>
                </tr>
            </thead>
            <%
            ArrayList arrayquest = new ArrayList<>();
            arrayquest = (ArrayList) request.getAttribute("arrayquest");
            %>
            <tbody>
                <% for(int p=0; p < arrayquest.size(); p=p+1) { %>
                    <%
                    HashMap hashquest = new HashMap<>();
                    hashquest = (HashMap) arrayquest.get(p);
                    %>
                <form>
                <tr>
                    <td><%= hashquest.get("QUESTIONS") %></td>
                   <% ArrayList arraychoice = new ArrayList(); %>
                    <% arraychoice = (ArrayList) request.getAttribute("arraychoice");%>
                    <% for (int first = 0; first < arraychoice.size(); first = first + 1) { %>
                        <%
                        HashMap hashchoice = new HashMap<>();
                        hashchoice = (HashMap) arraychoice.get(first); %>
                    <td><%= hashchoice.get("CHOICE") %></td>
                    <% } %>
                    </tr>
                </form>
            <% } %>
            </tbody>
        </table>
    </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</html>