
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

    <label for="pepperoni">Pepperoni</label><input name="toppings" id="pepperoni" type="checkbox" value="pepperoni">
    <label for="chicken">Chicken</label><input name="toppings" id="chicken" type="checkbox" value="chicken">
    <label for="beef">Beef</label><input name="toppings" id="beef" type="checkbox" value="beef">





</body>
</html>
