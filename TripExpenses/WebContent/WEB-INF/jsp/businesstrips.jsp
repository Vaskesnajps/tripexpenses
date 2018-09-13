<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users</title>
</head>
<body>

<table class = "table" border="2" width="600" >
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>From Date:</th>  
                        <th>To Date:</th>  
                        <th>Days count:</th>  
                        <th>Employee:</th>
                        <th>Location:</th>    
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="businesstrip" items="${businesstrips}">
                        <tr>
                            <td>${businesstrip.bustripid}</td>
                            <td>${businesstrip.fromdate}</td>  
                            <td>${businesstrip.todate}</td>  
                            <td>${businesstrip.dayscount}</td>  
                            <td>${businesstrip.employee}</td>  
                            <td>${businesstrip.location}</td>                        
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
</body>
</html>