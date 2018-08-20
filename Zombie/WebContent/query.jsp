<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>query</title>
</head>
<body>
<body bgcolor=thistle text=teal>
<jsp:include page="banner.jsp"/>
<h1>Ask a question</h1> <hr size="1" color=teal>
<form action="query.do" method="post">
<textarea name="query" rows="5" cols="30"></textarea><br>
<input type="submit" value="Ask">
</form>
</body>
</html>