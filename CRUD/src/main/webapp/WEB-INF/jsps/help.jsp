<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h2>Called by controller for help</h2>
<%
String user = (String)request.getAttribute("username");
%>
<%-- Hello <%=user %>!!!
 --%>
 
 Hello ${username}
 
 <hr> 
 
 <c:forEach var = "item" items="${marks}">
 <h1>${item}</h1>
 </c:forEach>
 </body>
</html>