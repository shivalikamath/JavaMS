<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>change</title>

</head>
<h1> Change Password</h1>
<body bgcolor=thistle text=teal>
<jsp:include page="banner.jsp"/>
<form action="change.do" method="get">
<font>${Invalid}</font>
New Password:<input type="password" id="password" name="password" required><br>
<input type="submit" value="change" >
</form>
<br><br>
</body>
</html>