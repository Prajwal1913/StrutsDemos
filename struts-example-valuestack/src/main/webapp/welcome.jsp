<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:property value="name"/><br>
<s:property value="message"/><br>
<s:property value="fruits"/><br>
<s:property value="#session.message"/><br>
<s:property value="#session.courses"/>
</body>
</html>