<%--
  Created by IntelliJ IDEA.
  User: 王海龙
  Date: 2020/12/2
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Login.jsp</h3>
<form action="${pageContext.request.contextPath}/login" method="post">
    <%--表明是第一个User对象的username age--%>
    <input type="text" name="username"><br/>
    <input type="password" name="password"><br/>
    <input type="submit" value="提交">


</form>
<div>
    <a href="/pages/userAdd.jsp"> 点击我跳转<a>
</div>
</body>
</html>
