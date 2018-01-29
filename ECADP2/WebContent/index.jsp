<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback Form</title>
</head>
<body>
<h1 align="center">Feedback Form</h1>
<form action="controller" method="post">
	<table align="center">
	<tr><td>Student Name : </td><td><input type="text" name="sname"></td></tr>
	<tr><td>Enrollment No. : </td><td><input type="text" name="enroll"></td></tr>
	<tr><td>Faculty Name : </td><td><input type="text" name="fname"></td></tr>
	<tr><td>Subject : </td><td><input type="text" name="sub"></td></tr>
	<tr><td>Feedback : </td><td><textarea rows="5" cols="21" name="feedback"></textarea></td></tr>
	<tr><td><input type="reset" value="Reset"></td><td><input type="submit" value="Submit"></td></tr>
	</table>
</form>
</body>
</html>