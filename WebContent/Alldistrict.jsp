<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javaScript">
	function disableBackButton() {
		window.history.forward();
	}
	setTimeout("disableBackButton()", 0);
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>District List</title>
<link rel="stylesheet" href="style.css" type="text/css" />
</head>
<body onload="disableBackButton()">

	<div class="main-container">

		<a class="ip-btn logout" href="Register.jsp">Log Out</a>
		<div class="main-content">

			<center>
				<h1>
					<font color="orange">List of All District</font>
				</h1>
			</center>
			<div align="center">
				<table class="detail-table" cellpadding="10" cellspacing="10"
					align="center">
					<tr>
						<td>kolkata</td>
					</tr>
					<tr>
						<td>Bankura</td>
					</tr>
					<tr>
						<td>Darjeeling</td>
					</tr>
					<tr>
						<td>Hooghly</td>
					</tr>
					<tr>
						<td>Jalpaiguri</td>
					</tr>
					<tr>
						<td>Murshidabad</td>
					</tr>
					<tr>
						<td>Purulia</td>
					</tr>
				</table>
				<br /> <a class="ip-btn" href="HomePage.jsp">Click here to go to Home Page</a>
			</div>
		</div>
	</div>
</body>
</html>