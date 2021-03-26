<%--
  Created by IntelliJ IDEA.
  User: wallysmith
  Date: 3/26/21
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Form</title>
</head>
<body>

    <form action="/pizza-order" method="post">
        <select name="crust_types" id="crust_types">
            <option value="rising-crust">Rising</option>
            <option value="thin">Thin</option>
        </select>

        <select name="sauce-type" id="sauce-type">
            <option value="marinara">Marinara</option>
            <option value="spicy-BBQ">Spicy-BBQ</option>
        </select>

        <select name="size" id="size">
            <option value="regular">Regular</option>
            <option value="big">Big</option>
        </select>
    </form>

    <input id="pepperoni" type="checkbox" value="pepperoni">
    <input id="chicken" type="checkbox" value="chicken">
    <input id="beef" type="checkbox" value="beef">
    <input id="sausage" type="checkbox" value="sausage">





</body>
</html>
