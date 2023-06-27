<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.HashMap, java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <title>Document</title>
</head>

<body>

    <div class="container">
        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th>QUESTION</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>ANSWER</td>
                    <td>
                        <tr>
                            <td> <div class="form-check">
                                <input id="q1answer1" name="q1answer" type="radio" class="form-check-input" checked="" required="">
                                <label class="form-check-label" for="credit" id="q1answer1">(1)전혀아니다</label>
                            </div> </td>
                        </tr>
                        <tr>
                            <td> <div class="form-check">
                                <input id="q1answer2" name="q1answer" type="radio" class="form-check-input" checked="" required="">
                                <label class="form-check-label" for="credit" id="q1answer2">(2)아니다</label>
                            </div> </td>
                
                        </tr>
                        <tr>
                            <td> <div class="form-check">
                                <input id="q1answer1" name="q1answer" type="radio" class="form-check-input" checked="" required="">
                                <label class="form-check-label" for="credit" id="q1answer2">(3)그렇다</label>
                            </div> </td>
                        </tr>
                        <tr>
                            <td> <div class="form-check">
                                <input id="q1answer1" name="q1answer" type="radio" class="form-check-input" checked="" required="">
                                <label class="form-check-label" for="credit" id="q1answer2">(4)매우그렇다</label>
                            </div> </td>
                        </tr>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>

</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

</html>