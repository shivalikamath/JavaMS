<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body bgcolor=thistle text=teal>
<jsp:include page="banner.jsp"/>

<form action="register.do" method="get">
<h1>Register</h1>
<font>${Invalid}</font>
<label for="userId">User Id: <input type="text" name="userId"	id="userId" required></label><br> <br>
<label for="email"> Email id: <input type="text" id="email"	name="email" required></label><br> <br>
<label for="password"> Password:<input type="password" id="password" name="password" required></label><br><br>
 
<br> <br> <input type="submit" id="submit"	name="submit" value="Submit">
 <input	type="submit" value="Cancel" /><br class="clear" /></form>
									
</body>
</html>