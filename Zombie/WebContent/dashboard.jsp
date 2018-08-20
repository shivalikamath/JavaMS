<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>

<body bgcolor=thistle text=teal>
<jsp:include page="banner.jsp"/>
<h1>My Dashboard</h1> <hr size="3">
User Id:${User.userId}<br>
Email:${User.email}
<br>Total feeds:${User.totalFeeds}<br>
<a href="query.jsp"> Ask Question</a>
</body>
</html>