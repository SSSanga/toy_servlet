<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>설문통계</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>

<body>
    <div class=>

    </div>
    <div class="text-center">
        <div class="h2">
        설문 통계
    </div>
        <thead>
            <tr>
                <td>참여자 총 인원</td>
            </tr>
        </thead>
        <br>
        <tbody>
            <tr>
                <td><%= request.getAttribute("TOTAL") %> 명</td>
            </tr>
        </tbody>

    </div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</html>