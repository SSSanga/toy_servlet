<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Option_Infos</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>

<body>
    <div class="container">
        <form action="/surveyServlet">
       <thead>
        <tr>
            <td>
                질문1
            </td>
        </tr>
       </thead>
       <br>
       <tbody>
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
       </tbody>
       <br>
       <thead>
        <tr>
            <td>
                질문2
            </td>
        </tr>
       </thead>
       <br>
       <tbody>
        <tr>
            <td> <div class="form-check">
                <input id="q2answer1" name="q2answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q2answer1">(1)전혀아니다</label>
            </div> </td>
        </tr>
        <tr>
            <td> <div class="form-check">
                <input id="q2answer2" name="q2answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q2answer2">(2)아니다</label>
            </div> </td>

        </tr>
        <tr>
            <td> <div class="form-check">
                <input id="q2answer3" name="q2answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q2answer3">(3)그렇다</label>
            </div> </td>
        </tr>
        <tr>
            <td> <div class="form-check">
                <input id="q2answer4" name="q2answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q2answer4">(4)매우그렇다</label>
            </div> </td>
        </tr>
       </tbody>
       <br>
       <thead>
        <tr>
            <td>
                질문3
            </td>
        </tr>
       </thead>
       <br>
       <tbody>
        <tr>
            <td> <div class="form-check">
                <input id="q3answer1" name="q2answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q3answer1">(1)전혀아니다</label>
            </div> </td>
        </tr>
        <tr>
            <td> <div class="form-check">
                <input id="q3answer2" name="q2answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q3answer2">(2)아니다</label>
            </div> </td>

        </tr>
        <tr>
            <td> <div class="form-check">
                <input id="q3answer3" name="q2answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q3answer3">(3)그렇다</label>
            </div> </td>
        </tr>
        <tr>
            <td> <div class="form-check">
                <input id="q3answer4" name="q2answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q3answer4">(4)매우그렇다</label>
            </div> </td>
        </tr>
       </tbody>
       <br>
       <thead>
        <tr>
            <td>
                질문4
            </td>
        </tr>
       </thead>
       <br>
       <tbody>
        <tr>
            <td> <div class="form-check">
                <input id="q4answer1" name="q4answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q4answer1">(1)전혀아니다</label>
            </div> </td>
        </tr>
        <tr>
            <td> <div class="form-check">
                <input id="q4answer2" name="q4answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q4answer2">(2)아니다</label>
            </div> </td>

        </tr>
        <tr>
            <td> <div class="form-check">
                <input id="q4answer3" name="q4answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q4answer3">(3)그렇다</label>
            </div> </td>
        </tr>
        <tr>
            <td> <div class="form-check">
                <input id="q4answer4" name="q4answer" type="radio" class="form-check-input" checked="" required="">
                <label class="form-check-label" for="credit" id="q4answer4">(4)매우그렇다</label>
            </div> </td>
        </tr>
       </tbody>
       <br>
       <thead>
        <tr>
            <td><button class="btn btn-success" type="submit",name ="">제출</button></td>
        </tr>
       </thead>
    </form>
    </div>
    <!-- 제출을 하면 설문자에 대한 1번 질문에대한 답, 2번 질문에 대한 답이 들어가야함.  -->


</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</html>
