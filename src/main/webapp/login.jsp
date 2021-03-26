<%--
  Created by IntelliJ IDEA.
  User: wallysmith
  Date: 3/25/21
  Time: 5:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equals("POST")) {
        if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("jeetkundo")) {
            response.sendRedirect("/profile.jsp");
        }
        response.sendRedirect("/login.jsp");
    }

%>

<html>
<head>
    <title>Title</title>
    <link href="" rel="stylesheet" type="text/css">

</head>
<body>
<jsp:include page="partials/navbar.jsp"/>

<h1>
    This is the Login Page!
</h1>

<div>

</div>


<%-- This form should have a username and password field--%>
<form method="POST" action="/login.jsp">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" placeholder="Enter your username" />
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" placeholder="Enter your password"/>
    <input type="submit" value="Login">
</form>

<%--<form method="POST" action="/login.jsp">--%>


<%--&lt;%&ndash;    <p class="red-text"><%=wrongCredentialsMessage%></p>&ndash;%&gt;--%>
<%--    <label for="username">Username</label>--%>
<%--    <input name="username" id="username" type="text">--%>

<%--    <br>--%>

<%--    <label for="userPassword">Password</label>--%>
<%--    <input name="userPassword" id="userPassword" type="password">--%>

<%--    <br>--%>

<%--    <input type="submit" value="Login">--%>

<%--</form>--%>


<script src=""></script>
</body>
</html>
