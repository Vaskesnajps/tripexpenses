<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All authorities</title>
</head>
<body>
<c:forEach var="authority" items="${authorities}">
		<p><c:out value="${authority}"></c:out></p>
	</c:forEach>

</body>
</html>