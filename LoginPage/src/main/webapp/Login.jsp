<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee login form</title>
<script type="text/javascript">
	function checkEmptySpace() {
		if (document.getElementById('userName').value == "") {
			alert("Please provide user name");
			return false;
		}
		if (document.getElementById('password').value == "") {
			alert("Please provide password");
			return false;
		}
	}
</script>
</head>
<body>
	<h1 align="center">Employee Login Form</h1>
	<form action="Login" method="post" onsubmit=" return checkEmptySpace()">
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