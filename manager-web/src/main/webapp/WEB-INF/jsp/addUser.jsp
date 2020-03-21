<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/3/21
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="/user/addUser"method="post">
    姓名：<input type="text" name="username">
    年龄：<input type="text" name="userage">
    <input type="submit" value="okok">
</form>
</body>
</html>
