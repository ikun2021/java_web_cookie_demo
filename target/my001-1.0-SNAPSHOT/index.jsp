<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>login screen
</h1>
<form action = "/cookieLogin" method = "post">
    用户名: <input type="text" name = "username"/><br/>
    密码: <input type ="password" name = "password"/><br/>
    <input type ="submit" value ="登录">
</form>



</body>
</html>