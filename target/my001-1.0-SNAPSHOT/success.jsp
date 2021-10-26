<%--
  Created by IntelliJ IDEA.
  User: mayitbe
  Date: 2021/7/7
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Welcome!
<%
    Cookie[] cookies = request.getCookies();
    for(Cookie cookie : cookies){
        out.write(cookie.getName()+":"+cookie.getValue());
    }
%>

<br/>
<a href = "/logout"> logout <a/>
</html>
