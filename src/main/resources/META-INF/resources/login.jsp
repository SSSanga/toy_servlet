<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <title>Login Page</title>
    <style>
        body {
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .form-signin {
            max-width: 400px;
            padding: 15px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
    <div class="container-fluid">
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
            </header>
          </div>
        <main class="form-signin">
            <% 
            String usernameSession = (String) session.getAttribute("username");

            if (usernameSession == null) { %>
                <form action="/surveyServletJSPing" method="get">
                    <h1 class="h3 mb-3 fw-normal">Please sign in</h1>
                    <div class="form-floating">
                        <input type="text" class="form-control" name="username" id="floatingInput" placeholder="ID">
                        <label for="floatingInput">ID</label>
                    </div>
                    <div class="form-floating">
                        <input type="password" class="form-control" name="password" id="floatingPassword" placeholder="Password">
                        <label for="floatingPassword">Password</label>
                    </div>
                    <div class="form-floating">
                        <button class="w-100 btn btn-lg btn-primary" type="submit">Login</button>
                    </div>
                    <div class="checkbox mb-3">
                        <label>
                            <input type="checkbox" value="remember-me"> Remember me
                        </label>
                    </div>
                </form>
            <% } else { %>
                <div>
                    User Name: <%= usernameSession %>
                </div>
                <P>
                <div class="form-floating">
                    <form action="/Login/DeleteServlet">
                        <button class="w-100 btn btn-lg btn-primary" type="submit">Logout</button>
                    </form>
                </div>
            <% } %>
        
        </main>
    </div>
</body>
</html>
