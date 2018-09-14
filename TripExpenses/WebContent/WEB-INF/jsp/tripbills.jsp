
    
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All trip bills</title>
</head>
<body>
<table class = "table" border="2" width="600" >
                <thead>
                    <tr>
                        <th>Trip bill Id</th>
                        <th>Total amount</th>  
                        <th>Business trip</th> 
                        <th>Action:</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="tripbill" items="${tripbills}">
                        <tr>
                            <td>${tripbill.tripbillid}</td>
                            <td>${tripbill.totalamount}</td>                        
                            <td>${tripbill.businesstrip}</td> 
                            <td><sec:authorize access="hasAuthority('admin')">
	<a onclick="if(!(confirm('Are u sure u want to delete? '))) return false" href="${pageContext.request.contextPath}/deletetripbill?tripbillid=${tripbill.tripbillid}">Delete</a>
                    </sec:authorize>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
</body>
</html>