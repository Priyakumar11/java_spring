<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New product</h1>
       <form:form method="post" action="save" modelAttribute="emp">  
      	<table >
      	<tr>  
          <td>pid : </td> 
          <td><form:input type="number" path="pid"  /></td>
         </tr>  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Price :</td>  
          <td><form:input type="number" path="price" /></td>
         </tr> 
         <tr>  
          <td>Qty :</td>  
          <td><form:input path="qty" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
</body>
</html>