<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	welcome :<br>
	<s:property value="student.studentName" />
	<br>
	<s:property value="student.studentId" />
	<br>
	<s:property value="student.city" />
	<br>
	<s:property value="student.phone" />
</body>
</html>