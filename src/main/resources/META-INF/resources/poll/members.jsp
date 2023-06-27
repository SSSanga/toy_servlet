<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ page import="java.util.HashMap, java.util.ArrayList" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
      <title>회원관리</title>
    </head>

    <body>
      <div class="container justify-content-center mt-5">
        <table class="table table-bordered  table-hover">
          <thead>
            <tr>
              <th>번호</th>
              <th>아이디</th>
              <th>이름</th>
              <th>상세정보</th>
            </tr>
          </thead>
          <tbody>
            <form action="">
              <tr>
                <td>1</td>
                <td>aaa999</td>
                <td>홍길동</td>
                <td><button type="submit" name="name" value="홍길동" formaction="/MembersInfoServlet" class="btn  btn-primary btn-sm">보기</button></td>
              </tr>
              <tr>
                <td>2</td>
                <td>bbb888</td>
                <td>장길산</td>
                <td><button type="submit" name="name" value="장길산" formaction="/poll/membersinfo.jsp" class="btn  btn-primary btn-sm">보기</button></td>
              </tr>
              <tr>
                <td>3</td>
                <td>ccc777</td>
                <td>신사임당</td>
                <td><button type="submit" name="name" value="신사임당" formaction="/poll/membersinfo.jsp" class="btn  btn-primary btn-sm">보기</button></td>
              </tr>
              <tr>
                <td>4</td>
                <td>ddd666</td>
                <td>김철수</td>
                <td><button type="submit" name="name" value="김철수" formaction="/poll/membersinfo.jsp" class="btn  btn-primary btn-sm">보기</button></td>
              </tr>
            </form>
          </tbody>
        </table>
      </div>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

    </html>