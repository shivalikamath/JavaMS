<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body bgcolor=thistle text=teal>
<jsp:include page="banner.jsp"/>

<% if(request.getParameter("Invalid")!=null){ %>
<font size="3" color="Red">Invalid Email ID / Password</font>
<%} %>
<form action="login.do" method="get">
		
			<h1>LOGIN PAGE</h1>
		
		<font>${Prompt}</font>
		<h1>HomePage</h1>
		<label for="userId">User id: <input type="text" id="userId"
			name="userId" required> </label>
	
			<label for="password">Password: <input
				type="password" id="password" name="password" 
				required></label><br>
			<br> 
			<input type="submit" value="Login">
	</form>
	<p>
		<a href="forget.jsp" style="color: teal">Forget password</a>
	</p>
	<p>
		<a href="register.jsp" style="color: teal">Register</a>
	</p>
</body>
</html>

