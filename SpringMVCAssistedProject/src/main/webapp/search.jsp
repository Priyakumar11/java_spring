<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%
	String f = request.getParameter("id");
session.setAttribute("id", f);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Product Details:
	<br>
	<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/sample1" user="root" password="Ponmalai11" />

	<sql:query dataSource="${snapshot}" var="result">
            SELECT * from product where pid='<%=session.getAttribute("id")%>';
         </sql:query>

	<table border="2">
<tr>
<th>Id</th>
<th>Name</th>  
<th>Qty</th>
<th>Price</th>
</tr>
<c:forEach items="${result.rows}" var="emp1">
	
	<tr>
		<td> ${emp1.pid} </td>
		<td> <c:out value ="${emp1.name}"/> </td>
		<td> <c:out value ="${emp1.qty}"/> </td>
		<td><c:out value ="${emp1.price}"/> </td>
		<td> <a href="editemp/${emp1.pid}">Edit</a></td>
		<td> <a href="deleteemp/${emp1.pid}">Delete</a></td>
	</tr>
</c:forEach>
</table>
<c:choose>
<c:when test="${result.rowCount==0}">
	Sorry! Not Available for that ID
</c:when>

</c:choose>



</body>
</html>
