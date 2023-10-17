<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="<%= request.getContextPath() %>/demo-servlet" method="post">

    <label>Name: </label><input type="text" name="Name"><br>
    <label>LastName: </label><input type="text" name="LastName"><br>
    <label>Email: </label><input type="text" name="Email"><br>
    <label>Password: </label><input type="text" name="Password"><br>
    <input type="submit" name="Submit">

</form>
</body>
</html>