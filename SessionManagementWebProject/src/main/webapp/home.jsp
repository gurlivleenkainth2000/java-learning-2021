<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%!
		String name = "NA";
	%>
	
	<%
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("keyName")) {
				name = cookie.getValue();
			}
		}
	%>
	
	<h3>Name is: <%= name %></h3>

</body>
</html>