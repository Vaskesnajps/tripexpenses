<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Business trip</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/docreatebusinesstrip" method="post">
	<table class="formtable">
		<tr>
			<td class="label">Id: </td>
			<td class="control"><input name="bustripid" type=text></td>
		</tr>
		<tr>
			<td class="label">Date from: </td>
			<td class="control">
			<input  class="control" name="fromdate"  />
			</td>
		</tr>
		<tr>
			<td class="label">To Date: </td>
			<td class="control">
			<input  name="todate"  />
			</td>
		</tr>
		<tr>
			<td class="label">Trip total allowance: </td>
			<td class="control">
			<input name="triptotallow"  />
			</td>
		</tr>
		<tr>
			<td class="label"></td>
			<td class="control"><input type="submit" value="Create new Business trip"></td>
		</tr>
	</table>
	<!-- <input name="${_csrf.paramaterName }" type="hidden" value="${_csrf.token}}" /> -->
</form>
</body>
</html>