<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Information</h1>

	<form:form method="POST" action="../editsave" modelAttribute="emp">
id: <form:input type="number" path="pid" />
		<br>
name: <form:input path="name" />
		<br>
qty: <form:input path="qty" />
		<br>
price: <form:input type="number" path="price" />
		<br>
		<input type="submit" value="Save changes">
	</form:form>
	
</body>
</html>