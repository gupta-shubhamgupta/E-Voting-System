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
<title>Voting Page</title>
<link rel="stylesheet" href="style.css" type="text/css" />

</head>
<body onload="disableBackButton()">

	<div class="main-container">
		<a class="ip-btn logout" href="Register.jsp">Log Out</a>
		<div class="main-content">
			<form action="Votecount" method="post">
				<%
					String vid1 = (String) session.getAttribute("coi");
					session.setAttribute("coi1", vid1);
				%>
				<div align="center">
					<table class="detail-table" cellpadding="10" cellspacing="10">
						<tr>
							<td>Voter ID : <%=vid1%></td>
						</tr>
					</table>
					<table class="detail-table" cellpadding="10" cellspacing="10">
						<tr>
							<td>BJP</td>
							<td><img class="logo-size"
								src="https://www.freepnglogos.com/uploads/bjp-logo-png/bharatiya-janata-party-logos-download-3.png"
								alt="BJP Logo" /></td>
							<td><input type="radio" value="111" name="uu" required></td>
						</tr>
						<tr>
							<td>Congress</td>
							<td><img class="logo-size"
								src="https://lh3.googleusercontent.com/proxy/V59YLrt5waiMsGtQ7gvfhCc1vTL9SLa6v1gS09SgzApnk7l3D2OMjGEKvlNyWKYAF3B7XBnLE7wooU68vmDRfK_9NJB4ThGgw9rk5gnEmaVCnrh7h3zpiKrv3ZyIr3vK"
								alt="Congress Logo" /></td>
							<td><input type="radio" value="222" name="uu" required></td>
						</tr>
					</table>
					<table>
						<tr>
							<td><input class="ip-btn winner-btn" type="submit"
								value="Submit"></td>
							<td><a class="ip-btn" href="HomePage.jsp">Home</a></td>
						</tr>
					</table>
				</div>
			</form>
		</div>
	</div>
</body>
</html>