<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/docreateemployee" method="post">
	<table class="formtable">
		<tr>
			<td class="label">Id: </td>
			<td class="control"><input name="employeeId" ></td>
		</tr>
		<tr>
			<td class="label">Full name: </td>
			<td class="control">
			<input  class="control" name="fullName"  />
			</td>
		</tr>
		<tr>
			<td class="label">Email: </td>
			<td class="control">
			<input    name="email"  />
			</td>
		</tr>
		<tr>
			<td class="label">Personal Number: </td>
			<td class="control">
			<input name="persIdNum"  />
			</td>
		</tr>
		<tr>
			<td class="label">Passport Number: </td>
			<td class="control">
			<input name="passNum"  />
			</td>
		</tr>
		<tr>
			<td class="label">Has Licence: </td>
			<td class="control">
			<input name="haslicence"  />
			</td>
		</tr>
		<tr>
			<td class="label"></td>
			<td class="control"><input type="submit" value="Create new employee"></td>
		</tr>
	</table>
	<!-- <input name="${_csrf.paramaterName }" type="hidden" value="${_csrf.token}}" /> -->
</form>
</body>
</html>