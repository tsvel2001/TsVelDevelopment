<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee login form</title>
</head>
<body>
	<h1 align="center">Employee Login Form</h1>
	<form action="Login" method="post">
		<div align="center">
			<label>UserName: <input type="text" id="userName"
				name="userName"></label>
		</div>
		<br>
		<div align="center">
			<label>Password: <input type="text" id="password"
				name="password"></label>
		</div>
		<br>
		<div align="center">
			<input type="submit" value="login">
		</div>
	</form>

</body>
</html>