<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees</title>
</head>
<body>
	<c:forEach var="employee" items="${employees}">
		<p><c:out value="${employee}"></c:out></p>
	</c:forEach>
</body>
</html>