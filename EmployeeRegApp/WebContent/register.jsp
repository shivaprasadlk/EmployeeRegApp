<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2><u>Employee Registration Form:</u></h2>
	<form action="servlet/Register" method="post">
		<table border="1" style="Width:50%">
			<tr>
				<td align="center"><b><i>Name:</i></b></td>
				<td align="left"><input type="text" name="userName" size="30"/><br/></td>
			</tr>
			<tr>
				<td align="center"><b><i>Password:</i></b></td>
				<td align="left"><input type="password" name="userPass" size="30"/><br/></td>
			</tr>
			<tr>
				<td align="center"><b><i>Email Id:</i></b></td>
				<td align="left"><input type="text" name="userEmail" size="30"/><br/></td>
			</tr>
			<tr>
				<td align="center"><b><i>Country:</i></b></td>
				<td align="left"><select style="width: auto;" name="userCountry">
						<option>India</option>
						<option>Pakistan</option>
						<option>other</option>
						</select></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
