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
<title>Eligibility</title>
<link rel="stylesheet" href="style.css" type="text/css" />
</head>
<body onload="disableBackButton()">

	<%
		String vid = (String) session.getAttribute("coi");
		String sta = (String) session.getAttribute("co");
		String dis = (String) session.getAttribute("cd");
	%>
	<div class="main-container">
		<a class="ip-btn logout" href="Register.jsp">Log Out</a>
		<div class="main-content specific">
			<table class="detail-table" cellpadding="10" cellspacing="10"
				align="center">
				<tr>
					<td>Voter ID : <%=vid%></td>
				</tr>
				<tr>
					<td>District : <%=dis%></td>
				</tr>
				<tr>
					<td>State : <%=sta%></td>
				</tr>
			</table>
			<div class="div-margin">
				<table align="center">
					<tr>
						<td><a class="ip-btn" href="HomePage.jsp">Home Page</a></td>

						<td><a class="ip-btn" href="Castvoter.jsp">Click here to Vote</a></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>