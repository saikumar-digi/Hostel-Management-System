<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Fundraiser List</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<style>
    body {
  
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<body style="background-color:">
<h4>
        <a href="Admin"  style="font:Georgia;font-size: 15px; float:left;color:red">BACK</a>    
        </h4>
<center>
<h1>Room's List</h1>
<br>
</center>
 <div class="container">
 
  <table class="table table-striped">
   <thead class="thead-dark">

    <th scope="row" style="color: yellow;">roomNo </th>
    <th scope="row" style="color: yellow;">roomType </th>
     <th scope="row" style="color: yellow;">status</th>
       
                
     <th scope="row" style="color: yellow;">Update</th>
    <th scope="row" style="color: yellow;">Delete</th>
   </thead>
   <tbody>
    <c:forEach items="${roomlist}" var="war" >
     <tr>
 <td>${war.roomNo}</td>
      <td>${war.roomType}</td>
      <td>${war.status}</td>

     
      <td>
       <spring:url value="editRoom/${war.roomNo}" var="editURL" />
       <a class="btn btn-info" href="${editURL}" role="button">Update</a>
      </td>
      <td>
       <spring:url value="deleteroom/${war.roomNo}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button">Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  
  <spring:url value="addRoom/" var="addURL" />
  <center>
  <a class="btn btn-success" href="${addURL}" role="button">Add New Room</a>
  </center>
 </div>
</body>
</html>