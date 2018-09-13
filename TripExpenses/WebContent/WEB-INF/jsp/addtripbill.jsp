<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Trip bill</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/docreatebill" method="post">
	<table class="formtable">
		<tr>
			<td class="label">Id: </td>
			<td class="control"><input name="billId" type=text></td>
		</tr>
		<tr>
			<td class="label">Item: </td>
			<td class="control">
			<input  class="control" name="billItem"  />
			</td>
		</tr>
		<tr>
			<td class="label">Price: </td>
			<td class="control">
			<input    name="price"  />
			</td>
		</tr>
		<tr>
			<td class="label">Date: </td>
			<td class="control">
			<input name="billDate"  />
			</td>
		</tr>
		<tr>
			<td class="label"></td>
			<td class="control"><input type="submit" value="Create new bill"></td>
		</tr>
	</table>
	<!-- <input name="${_csrf.paramaterName }" type="hidden" value="${_csrf.token}}" /> -->
</form>
</body>
</html>