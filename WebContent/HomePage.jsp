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
<title>Home Page</title>
<link rel="stylesheet" href="style.css" type="text/css" />
</head>
<body onload="disableBackButton()">

	<div class="main-container">
		<a class="ip-btn logout" href="Register.jsp">Log Out</a>
		<div class="main-content">

			<h3 align="center">
				<font color="red">${pMsg}</font>
			</h3>
			<h3 align="center">
				<font color="green">${Msg}</font>
			</h3>
			<h3 align="center">
				<font color="orange">${vMsg}</font>
			</h3>
			<%
				
				String vid = (String) session.getAttribute("vid");
				String name = (String) session.getAttribute("name");
				String dob = (String) session.getAttribute("dob");
				String add = (String) session.getAttribute("address");
				String dis = (String) session.getAttribute("dis");
				String sta = (String) session.getAttribute("state");
				String pin = (String) session.getAttribute("pin");
				String winner=(String)request.getAttribute("win") !=null?(String)request.getAttribute("win") + " wins!":"";
				session.setAttribute("coi", vid);
				session.setAttribute("co", sta);
				session.setAttribute("cd", dis);
			%>
			<table class="detail-table" cellpadding="10" cellspacing="10"
				align="center">
				<tr>
					<td>Voter ID</td>
					<td><%=vid%></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><%=name%></td>
				</tr>
				<tr>
					<td>DOB</td>
					<td><%=dob%></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><%=add%></td>
				</tr>
				<tr>
					<td>District</td>
					<td><%=dis%></td>
				</tr>
				<tr>
					<td>State</td>
					<td><%=sta%></td>
				</tr>
				<tr>
					<td>PinCode</td>
					<td><%=pin%></td>
				</tr>
			</table>
			<br>
			<h1 class="result"><%=winner%></h1>
			<br />
			<table align="center">
				<tr>
					<td><a class="ip-btn" href="Alldistrict.jsp">All districts</a>
					</td>
					<td><a class="ip-btn" href="Eligibledistrict.jsp">My
							district</a></td>
					<td>
						<form action="Winnercontroller" method="post">
							
							<input class="ip-btn winner-btn" type="submit" value="Check Winner">
						</form>
					</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>