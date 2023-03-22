<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

</head>
<body>
<%@ include file="/header.jsp" %>

<%-- check if there is an error message and display it --%>
<c:if test="${not empty sessionScope.error}">
    <div class="alert alert-danger">${sessionScope.error}</div>
    <%-- remove the error message from the session --%>
    <c:remove var="error" scope="session"/>
</c:if>
<main>
    <h1>Login</h1>
    
   
        <form action="login" method="post" class="login-form">
         	<div class="input-container">
            <label for="email">email:</label>
            <input type="email" id="email" name="email" />
            </div>
            	<div class="input-container">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" />
            </div>
            <button	 type="submit"  > submit</button>
        </form>
   </main>
    
    <%@ include file="/footer.jsp" %>
    
</body>
</html>
