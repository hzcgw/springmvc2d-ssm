<%--
  Created by IntelliJ IDEA.
  User: cgw
  Date: 2021/9/6
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎</title>
</head>
<body>
<h3>${user.userName} -- 欢迎登录</h3>
<hr>
<h2>${user.userId} -- ${user.userName} -- ${user.userPwd} -- ${user.userEmail} -- ${user.createDate} -- ${user.updateDate}</h2>
</body>
</html>
