<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h2>Called by controller</h2>
<%

String user = (String)request.getAttribute("name");
%>
Hello <%=user %>!!!
</body>
</html>