<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess A Number 1-3</title>
</head>
<body>
<form action="/guess" method="post">
    <label for="guess">Guess a number between 1-3</label>
    <input id="guess" name="guess" type="number" min="1" max="3" required>
    <input type="submit">
</form>
</body>
</html>