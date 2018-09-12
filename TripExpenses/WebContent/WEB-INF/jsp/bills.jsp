<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bills</title>
</head>
<body>
	<c:forEach var="bill" items="${bills}">
		<p><c:out value="${bill}"></c:out></p>
	</c:forEach>
</body>
</html>