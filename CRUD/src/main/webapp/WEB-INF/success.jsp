<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Worker Details</title>
</head>
<body>
<form action="viewData" method="get">
<table border="1" width="90%">  
<tr><th>TaskId</th><th>Name</th><th>Email</th>  
<th>TaskStatus</th><th>Create Date</th><th>Edit</th><th>Delete</th></tr>  
<C:forEach items="${list}" var="u">  
<tr><td>${u.TaskId}</td><td>${u.Username}</td>  
<td>${u.Email}</td><td>${u.TaskStatus}</td> 
</form>
</C:forEach>  
</table>  
</body>
</html>