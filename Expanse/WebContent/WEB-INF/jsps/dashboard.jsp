<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean-el" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic-el" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DashBoard</title>
</head>
<body>
<center>
	<table>
		<tr>
			<td><a href="addExpanse.jsp">Add Expanse</a></td>
			<td>Total Expanse for current Month:<b>${total}</b></td>
			<td>Debt: ${debt}</td>
			<td>Credit: ${credit}</td>
			<td><a href="/statitcs">Statitics</a>
		<tr>			
	</table>
	<hr/>
	<hr/>
	<h3> Expanse Details are as follows:</h3>
	<table>
		<th>Date</th>
		<th>Item Summary</th>
		<th>Category</th>
		<th>Amount</th>
		<th>Contribution</th>
		<th>Paid By</th>
		<th>Evidance</th>
		
		<logic:iterate id="expense" collection="${expenses}" scope="request" type="expanse.entity.Expense">
			<tr>
				<td>${expense.}
		</logic:iterate>
	</table>
</center>
<h1>Thank you! ${sessionScope.loggedUser.getName()}) logged in successfully. </h1>
</body>
</html>