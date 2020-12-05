<%--
  Created by IntelliJ IDEA.
  User: 王海龙
  Date: 2020/12/2
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>update.jsp</h2>

<form action="${pageContext.request.contextPath}/update" method="post">

    <c:if test="${user != null}">

        <input type="hidden" name="id" value="${user.id}">
        <input type="text" name="username" value="${user.username}"><br/>
        <input type="password" name="password" value="${user.password}"><br/>
        <input type="submit" value="提交">

    </c:if>




</form>
</body>
</html>
