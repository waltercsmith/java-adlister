<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>


<head>
    <title>Viewing Result</title>



</head>



<body>




    <c:if test="${correct == true}">
        <h1>Hey now, you're an all-star, get your game on! Go play!</h1>
        <a href="/guess">Play again?</a>
    </c:if>
    <c:if test="${incorrect == true}">
        <h1>You chose... poorly...</h1>
        <a href="/guess">Don't give up. Challenge again!</a>
    </c:if>



</body>


</html>