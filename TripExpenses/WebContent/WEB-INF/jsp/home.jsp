<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<p><a href="${pageContext.request.contextPath}/locations">Show all locations</a></p>
	<p><a href="${pageContext.request.contextPath}/addlocation">Add new location</a></p>
	<p><a href="${pageContext.request.contextPath}/bills">Show all trips</a></p>
	<p><a href="${pageContext.request.contextPath}/addbill">Add new trip</a></p>
	<p><a href="${pageContext.request.contextPath}/tripbills">Show all trip bills</a></p>
	<p><a href="${pageContext.request.contextPath}/addbill">Add new trip bill</a></p>
</body>
</html>