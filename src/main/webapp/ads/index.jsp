
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>


    <h1>Here's All the Ads</h1>

<c:forEach items="${ads}" var="ad" >
    <div class="container">
        <h3>${ad.title}</h3>
        <p>ID: ${ad.id}</p>
        <p>Description: ${ad.description}</p>

    </div>
    <br>

</c:forEach>


</body>
</html>
