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
		<div align="center" class="LoginBox">
			<label>UserName: <input type="text" placeholder="enter user name" id="userName"
				name="userName" required="required"></label>
		<br>
		<br>
			<label>Password: <input type="password" placeholder="**********" id="password"
				name="password" required="required"></label>
		<br>
		<br>
			<input type="submit" value="login">
		</div>
	</form>

</body>
</html>