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
    <link href="" rel="stylesheet" type="text/css">

</head>
<body>
<jsp:include page="partials/navbar.jsp"/>


<%-- This form should have a username and password field--%>
<form method="POST" action="">
    <label for="username1">Username:</label>
    <input type="text" id="username1" name="username" placeholder="Enter your username" />
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" placeholder="Enter your password"/>
    <button>Login</button>
</form>

<form method="POST" action="/login.jsp">


<%--    <p class="red-text"><%=wrongCredentialsMessage%></p>--%>
    <label for="username">Username</label>
    <input name="username" id="username" type="text">

    <br>

    <label for="userPassword">Password</label>
    <input name="userPassword" id="userPassword" type="password">

    <br>

    <input type="submit" value="Login">

</form>


<script src=""></script>
</body>
</html>
