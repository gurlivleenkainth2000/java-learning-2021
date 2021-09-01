<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	
	<h3>Name is: <%= session.getAttribute("name") %></h3>
	<h3>Age is: <%= session.getAttribute("age") %></h3>

</body>
</html>