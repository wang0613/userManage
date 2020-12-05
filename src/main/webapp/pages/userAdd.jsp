<%--
  Created by IntelliJ IDEA.
  User: 王海龙
  Date: 2020/12/2
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>UserAdd.jsp</h2>
<form action="${pageContext.request.contextPath}/add" method="post">
    <input type="text" name="username"><br/>
    <input type="password" name="password"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
