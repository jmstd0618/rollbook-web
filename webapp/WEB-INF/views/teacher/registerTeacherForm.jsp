<%--
  Created by IntelliJ IDEA.
  User: Naver
  Date: 2015-11-04
  Time: 오후 3:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="/js/lib/jquery-2.1.4.js"></script>

  <title></title>
</head>
<body>
  hi ${name}  hoy
  <form role="form" class="default-margin" id="fileUrl" action="/teacher/register" accept-charset="UTF-8" method="post">
    <div class="form-group">
      <label for="name">선생님 이름</label>
      <input type="text" class="form-control" name="name" id="name" placeholder="이름을 입력해주세요.">
    </div>
    <div class="form-group">
      <label for="birthDay">생일</label>
      <input type="text" class="form-control" name="birthDay" id="birthDay" placeholder="이름을 입력해주세요.">
    </div>
    <div class="form-group">
      <label for="phoneNo">연락처</label>
      <input type="text" class="form-control" name="phoneNo" id="phoneNo" placeholder="이름을 입력해주세요.">
    </div>
    <div class="form-group">
      <label for="classId">반</label>
      <input type="text" class="form-control" name="classId" id="classId" placeholder="이름을 입력해주세요.">
    </div>
    <button type="submit" class="btn btn-sm btn-success">등록</button>
  </form>
</body>
</html>
