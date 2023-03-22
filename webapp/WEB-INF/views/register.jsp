<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/header.jsp" %>
	
<main>
	<form class="registration-form" action="register" method="post">
		<h2>Register</h2>
		<div class="input-container">
			<label for="name">Name:</label>
			<input type="text" id="name" name="name" required>
		</div>
		<div class="input-container">
			<label for="email">Email:</label>
			<input type="email" id="email" name="email" required>
		</div>
		<div class="input-container">
			<label for="password">Password:</label>
			<input type="password" id="password" name="password" required>
		</div>
		<button type="submit">Submit</button>
	</form>
</main>
	
<%@ include file="/footer.jsp" %>
