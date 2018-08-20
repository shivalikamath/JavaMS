<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>feeds</title>
</head>
<body bgcolor=thistle text=teal>
<jsp:include page="banner.jsp"/>
<br>
	<table align="center" width="50%" border="1" cellspacing="5">
		
			<th>Query</th><th>Feed Time</th><th>Total comments</th>
		
		<c:forEach items="${ Feeds }" var="feeds">
		<tr>
			<td><a href="question.do?id=${feeds.feedId}">${ feeds.query }</a></td>
			<td>${ feeds.feedTime }</td>
			<td>${ feeds.totalCmnts }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>