<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index-file</title>
</head>
<body>
<form action="sendMail.do" method="post">
	To:<input type="text" name="toMailId"><br>
	Subject:<input type="text" name="subject"><br>
	Body: <textarea id="mail" rows="5"  name="body"></textarea>
	<input type="Submit" value="Send Mail">
	</form>
</body>
</html>
