<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html-el" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<center>
<h3>Please Login to see your activities!</h3>
<html:form action="login" method="post">
<html:errors property="failure" />
	<table>
		<tr>
			<td>Username:</td>
			<td><html:text property="username" title="Username"/></td>
			<td><html:errors property="username"/></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><html:password property="password" title="Password"/></td>
			<td><html:errors property="password" /> </td>
		</tr>
		<tr>
			<td></td>
			<td colspan="2"><html:submit/></td>
		</tr>
		<tr>
			<td colspan="3"><a href="register.jsp">Register Yourself!</a></td>
		</tr>
	</table>
</html:form>
</center>
</body>
</html>