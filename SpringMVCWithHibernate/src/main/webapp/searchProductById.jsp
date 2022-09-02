<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Search product</h2>
<form action="searchProduct" method="get">
	<label>Product Id</label>
	<input type="number" name="pid"><br/>
	<input type="submit" value="Search Product"/>
	<input type="reset" value="reset"/>
</form>
<br/>
${requestScope.msg}
<br/>
<a href="index.jsp">Back</a>
</body>
</html>