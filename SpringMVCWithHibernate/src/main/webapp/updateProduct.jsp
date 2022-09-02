<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}
<h2>Update recordr</h2>
<form action="updateProduct" method="post">
	<label>Product Id</label>
	<input type="number" name="pid"><br/>
	<label>Price</label>
	
	<input type="number" name="price"><br/>
	
	<input type="submit" value="Update Product"/>
	<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>