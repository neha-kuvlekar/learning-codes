<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@page isELIgnored="false" %>
                 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@include file="./baseforstyling.jsp" %></head>

  <body>
  
  <div class= "container mt-5">
  	<h3 class ="text-center">Edit Worker Form</h3>
<!--    <form action="/processform" > absolute path
 -->      <form action="${pageContext.request.contextPath}/handle-product" method="post">
   
     <div class="form-group">
    <label for="TaskId">TaskId</label>
    <input type="text" class="form-control" id="TaskId" name="TaskId" aria-describedby="emailHelp" >
  </div>
   <div class="form-group">
    <label for="username">UserName</label>
    <input type="text" class="form-control" id="username" name="username" aria-describedby="emailHelp" placeholder="Enter name">
  </div>
   <div class="form-group">
    <label for="email">email</label>
    <input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp" placeholder="Enter email">
  </div>
 
<!--   <div class="form-group">
    <label for="taskstatus">Task Status</label>
	<select name="TaskStatus" class="form-control" id="TaskStatus" multiple>
		<option>Started</option>
		<option>Scheduled</option>
		<option>Pending</option>
		<option>Completed</option>
		<option>Not assigned</option>
	
	</select> 
  </div>-->
  
   <div class="form-group">
    <label for="taskstatus">Task Status</label>
    <input type="text" class="form-control" id="TaskStatus" name="TaskStatus" aria-describedby="emailHelp" placeholder="Enter TaskStatus">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password">
  </div>
  
   <div class="form-group">
    <label for="create_time">create_time</label>
    <input type="type" class="form-control" id="create_time" name="create_time" aria-describedby="emailHelp" placeholder="dd/MM/yyyy">
  </div>
     <button type="submit" class="btn btn-primary">Edit</button>
   
</form>

</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>