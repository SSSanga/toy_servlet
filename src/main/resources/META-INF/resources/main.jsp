<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <title>Main</title>
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
            <form action="/LoginPageServlet">
              <button type="submit" class="btn btn-outline-primary me-2" >Login</button>
            </form>
          </div>
        </header>
      </div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</html>