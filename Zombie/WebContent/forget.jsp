
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>forget</title>
</head>
<body bgcolor=thistle text=teal>
<jsp:include page="banner.jsp"/>

	<form action="forget.do" method="get">
		
			<h1>ForgetPassword</h1>
	
		<font>${Invalid}</font>
		<label for="userId">User ID: <input type="text" id="userId"
			name="userId" required> <br>
		
		<br> <label for="email">Enter your Email ID: <input
				type="text" id="email" name="email" required><br><br>
			<br> <input type="submit" value="Submit"><br>
	</form>

</body>
</html>

