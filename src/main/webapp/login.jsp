<%--
  Created by IntelliJ IDEA.
  User: wallysmith
  Date: 3/25/21
  Time: 5:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>

<%-- This form should have a username and password field--%>
<form method="POST" action="">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter your username" />
    <label for="password">Password:</label>
    <input id="password" name="password" placeholder="Enter your password"/>
</form>

</body>
</html>
