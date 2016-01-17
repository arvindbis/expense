<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
    <%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Expense</title>
</head>
<body>
<script type="text/javascript">
	function showTeam(){
		if(document.getElementById("expenseType").value == 2){
			document.getElementById("team").style.display = "table-row";
		}else{
			document.getElementById("team").style.display = "none";
		}
			
	}
</script>
<center>
	<html:form action="/expense" method="post">
		<table>
			<tr>
				<td>Expanse Type:</td>
				<td colspan="3">
					<html:select styleId="expenseType" property="expenseType" onchange="showTeam()">
						<logic:iterate id="type" collection="${expenseTypes}" type="expanse.entity.ExpenseType">
							<html:option value="${type.getId()}" >${type.getName()}</html:option>
						</logic:iterate>
					</html:select>
					<!-- <select name="expanseType">
						<option value="1">Personal</option>
						<option value="2">Shareable</option>
					</select> -->
				</td>
			</tr>
			<tr id="team" style="display: none;">
				<logic:iterate id="member" collection="${loggedUser.getTeamMembers()}" type="expanse.entity.User">
					<td><input type="checkbox" value="${member.getUserID()}" name="members"/>${member.getName()}</td>
				</logic:iterate>
			</tr>
			<tr>
				<td>Expense Date:</td>
				<td>
					<select name="expanseDay">
						<%for (int i=1 ; i<32 ; i++){%>
							<option value="<%=i %>"><%=i %></option>
						<% } %>
					</select>
				</td>
				<td>
					<select name="expanseMonth">
						<%for (int i=1 ; i<13 ; i++){%>
							<option value="<%=i %>"><%=i %></option>
						<% } %>
					</select>
				</td>
				<td>
					<select name="expanseYear">
						<%for (int i=15 ; i<18 ; i++){%>
							<option value="<%=i %>"><%=i %></option>
						<% } %>
					</select>
				</td>
			</tr>
			<tr>
				<td>Amount:</td>
				<td colspan="3"><input type="text" name="amount"/>
			</tr>
			<tr>
				<td>Category:</td>
				<td colspan="3">
					<select name="categoryID">
						<logic:iterate id="cate" collection="${categories}" scope="" type="expanse.entity.Category">
							<option value="${cate.getId()}">${cate.getName()}</option>
						</logic:iterate>
					</select>
			</tr>
			<tr>
				<td>Description:</td>
				<td colspan="3"><input type="text" name="description"/>
			</tr>
			<tr>
				<td colspan="4"><input type="submit"/>
			</tr>
		</table>
	</html:form>
	
	</center>
</body>
</html>