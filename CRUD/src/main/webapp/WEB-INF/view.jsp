<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page isELIgnored="false" %>
    
             <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./baseforstyling.jsp" %></head>
</head>
<body>

 <div class="container" mt-3>
 
 	<div class="row">
 		<div class="col-md-12">
 			<h1 class="text-centre mb-3">Worker's Data</h1>
 		<table class="table ">
  <thead table-dark>
    <tr>
      <th scope="col">TaskId</th>
      <th scope="col">Username</th>
      <th scope="col">Email</th>
      <th scope="col">Created on</th>
      <th scope="col">Task Status</th>
      <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
  <C:forEach items="${list }" var="p">
    <tr>
   <th scope="row">${p.getTaskId() }</th>
      <td>${p.getUsername() }</td>
      <td>${p.getEmail() }</td>
      <td>${p.getCreate_time() }</td>
       <td>${p.getTaskStatus() }</td> 
      <td>      
      <a href="editproduct/${p.getTaskId() }" mt-2 mr-2><i class="fas fa-user-edit text-danger"></i></a>
            <a href="deleteproduct/${p.getTaskId() }"><i class="fas fa-trash-alt"></i></a>
      
      </td>
    </tr>
   </C:forEach>
  </tbody>
</table>

 <div class= "container mt-5 text-centre">
  <button type="button" aria-pressed="true">
  <a href="addproduct" class="btn outline-success">Add</a></button>
   </div>
 		</div>
 	
 	</div>
 </div>

</body>
</html>