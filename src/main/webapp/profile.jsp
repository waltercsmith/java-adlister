<%--
  Created by IntelliJ IDEA.
  User: wallysmith
  Date: 3/25/21
  Time: 5:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Profile Page</title>
</head>
<body>

    <h1>This is the Profile page!</h1>

    <c:choose>
        <c:when test="${param.containsKey('username')}">
            <p>Hello there ${param.username}</p>
        </c:when>

        <c:otherwise>
            <p>You're not authorized to be here!</p>
        </c:otherwise>
    </c:choose>


</body>
</html>
