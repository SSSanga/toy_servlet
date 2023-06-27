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
        <main class="form-signin">
            <% 
            String usernameSession = (String) session.getAttribute("username");

            if (usernameSession == null) { %>
                <form action="/Login/CreateServlet" method="get">
                    <img class="mb-4" src="/docs/5.2/assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
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
                <div class="form-floating">
                    <form action="/Login/DeleteServlet">
                        <button class="w-100 btn btn-lg btn-primary" type="submit">Logout</button>
                    </form>
                </div>
            <% } %>
            <div>
                Code Value: <%= request.getAttribute("contents") %>
            </div>
        </main>
    </div>
</body>
</html>
