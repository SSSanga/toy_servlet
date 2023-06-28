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
                        <th>설문 하기</th>
                    </thead>
                    <% ArrayList arrayquest=new ArrayList<>();
                        arrayquest = (ArrayList) request.getAttribute("arrayquest");
                        %>
                        <tbody>
                            <% for(int p=0; p < arrayquest.size(); p=p+1) { %>
                                <% HashMap hashquest=new HashMap<>();
                                    hashquest = (HashMap) arrayquest.get(p);
                                    %>
                                    <form>
                                        <tr>
                                            <th>
                                                <%= hashquest.get("QUESTIONS") %>
                                            </th>
                                        </tr>
                                        <% ArrayList arraychoice=new ArrayList(); %>
                                            <% arraychoice=(ArrayList) request.getAttribute("arraychoice");%>
                                                <% for (int first=0; first < arraychoice.size(); first=first + 1) { %>
                                                    <% HashMap hashchoice=new HashMap<>();
                                                        hashchoice = (HashMap) arraychoice.get(first); %>
                                                        <tr>
                                                            <td>
                                                                <input id="" name="choice" type="radio"
                                                                    class="form-check-input" checked="" required=""
                                                                    value="<%= hashchoice.get(" CHOICE") %>">
                                                                <%= hashchoice.get("CHOICE") %>
                                                            </td>
                                                            <% } %>
                                                        </tr>
                                    </form>
                                    <% } %>
                                        <tr>
                                            <td>
                                                <form action="/StatisticsServlet">
                                                    <button class="w-100 btn btn-lg btn-primary"
                                                        type="submit">SUBMIT</button>
                                                </form>
                                            </td>
                                        </tr>
                        </tbody>
                </table>
            </div>
        </body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

        </html>