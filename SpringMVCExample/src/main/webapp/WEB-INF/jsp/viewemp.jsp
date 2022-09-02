<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    

    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>Id</th>
<th>Name</th>  
<th>Designation</th>
<th>Salary</th>
</tr>
<c:forEach items="${empList}" var="emp1">
	
	<tr>
		<td> ${emp1.eid} </td>
		<td> <c:out value ="${emp1.name}"/> </td>
		<td> <c:out value ="${emp1.designation}"/> </td>
		<td><c:out value ="${emp1.salary}"/> </td>
		<td> <a href="editemp/${emp1.eid}">Edit</a></td>
		<td> <a href="deleteemp/${emp1.eid}">Delete</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>