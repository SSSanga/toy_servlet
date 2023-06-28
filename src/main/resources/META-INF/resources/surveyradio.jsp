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
            <div class="container">
                <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
                  <a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none">
                    <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"></use></svg>
                  </a>
            
                  <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
                    <li><a href="/surveyServletJSPing" class="nav-link px-2 link-secondary">설문</a></li>
                        <li><a href="/MembersServlet" class="nav-link px-2 link-dark">회원</a></li>
                        <li><a href="/StatisticsServlet" class="nav-link px-2 link-dark">통계</a></li>
                  </ul>
            
                  <div class="col-md-3 text-end">
                    <form action="/MainServlet">
                        <button type="submit" class="btn btn-outline-primary me-2" >Home</button>
                    </form>
            </div>
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
                                                                    class="form-check-input"
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