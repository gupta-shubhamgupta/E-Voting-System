<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
<link rel="stylesheet" href="style.css" type="text/css" />
</head>
<body>
	<div class="main-contaier">
		<div class="header">
			<center>
				<h1>eVoting System</h1>
			</center>
			<center>
				<p>Project by Shubham Gupta</p>
			</center>
		</div>
		<div class="main-content">
			<form action="Registercontroller" method="post">
				<h3 align="center">
					<font color="red">${psMsg}</font>
				</h3>
				<table cellpadding="10" cellspacing="10" align="center">
					<tr>
						<td><b>Voter ID:</b><input class="voter-id-ip" type="text"
							name="voterid" required></td>
					</tr>
					<tr>
						<td class="register-btn-body"><input class="ip-btn"
							type="submit" value="Register"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>