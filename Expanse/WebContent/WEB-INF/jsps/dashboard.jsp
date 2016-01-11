<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>    
<%@ page import="expanse.entity.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DashBoard</title>
</head>
<body>
<h3>Welcome, ${loggedUser.getName()} . Your Last visit was at ${loggedUser.getLastLoginString()}.</h3>
<center>
	<table>
		<tr>
			<td><a href="addExpanse.jsp">Add Expanse</a></td>
			<td>Total Expanse for current Month:<b>${total}</b></td>
			<td>Debt: </b>${debt}</b></td>
			<td>Credit: <b> ${credit}</b></td>
			<td><a href="/statitcs">Statitics<coming soon!></a>
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
		<th>Evidence</th>
		
		<logic:iterate id="expense" name="expenses" scope="request" type="expanse.entity.Expense">
			<tr>
				<td>${expense.getExpenseDate()}</td>
				<td>${expense.getDescription()}</td>
				<td>${expense.getCategoryID()}</td>
				<td>${expense.getAmount()}</td>
				<td>${expense.getAmount()/expense.getTeamSize()}</td>
				<td>${expense.getPaidBy()}</td>
				<td>coming soon!</td>
			</tr>
		</logic:iterate>
	</table>
</center>

</body>
</html>