<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html-el"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<center>
<html:form action="register" method="post">
	<table>
	<tr>
		<td>Username:</td>
		<td><html:text property="username"/></td>
		<td><html:errors property="username"/></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><html:password property="password"/></td>
		<td><html:errors property="password" /> </td>
	</tr>
	<tr>
		<td>Confirm Password:</td>
		<td><html:password property="confPassword"/></td>
		<td><html:errors property="confPassword" /> </td>
	</tr>
	<tr>
		<td>Name:</td>
		<td><html:text property="name"/></td>
		<td><html:errors property="name" /> </td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><html:text property="email"/></td>
		<td><html:errors property="email" /> </td>
	</tr>
	<tr>
		<td colspan="2" align="right"><html:submit/></td>
		<td></td>
	</tr>
	</table>
</html:form>
	
</center>

</body>
</html>