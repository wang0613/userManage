<%--
  Created by IntelliJ IDEA.
  User: 王海龙
  Date: 2020/12/2
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="500" align="center">
    <tr>
        <td>用户id</td>
        <td>用户名</td>
        <td>密码</td>
        <td>操作</td>
    </tr>


    <c:forEach items="${userList}" var="user">
        <c:if test="${user != null}">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td><a href="${pageContext.request.contextPath}/findById?id=${user.id}">修改</a></td>
            </tr>
        </c:if>
    </c:forEach>


</table>
</body>
</html>
