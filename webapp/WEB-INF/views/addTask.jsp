<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<header>
    <%@ include file="/header.jsp" %>

      <h1>Tasks</h1>
     
    </header>
	<h1>Add Todo</h1>
	<form method="post" action="addTask">
		<label for="task">Title:</label>
		<input type="text" id="task" name="task" required><br>
		<button type="submit">Add</button>
	</form>
	    <%@ include file="/footer.jsp" %>
	
</body>
</html>