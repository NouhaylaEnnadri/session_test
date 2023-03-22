<%@ page import="java.util.List"%>
<%@ page import="com.estf.exam.beans.*"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Todos</title>
</head>
<body>
	<header>
	    <%@ include file="/header.jsp" %>
	
	</header>
	<h1>List Todos</h1>
	<table>
		<thead>
			<tr>
				<th>Title</th>
				<th>Completed</th>
			</tr>
		</thead>
		<tbody>
			<%
			@SuppressWarnings("unchecked")
			List<Task> tasks = (List<Task>) request.getAttribute("tasks");
			if (tasks != null) {
				for (Task task : tasks) {
			%>
			<tr>
				<td><%=task.getTask()%></td>
						</tr>
			<%
			}
			} else {
			%>
			<tr>
				<td colspan="2">No Todos Found</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<a href="<%=request.getContextPath()%>/task/addTask">add Task</a>
</body>
	    <%@ include file="/footer.jsp" %>

</html>
