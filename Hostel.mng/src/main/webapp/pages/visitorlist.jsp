<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Student List</title>
<style>
body {
background-image: url("../pages/img/rom.jpg");
background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;
}
</style>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>

<body>

        <h4>
        <a href="Admin"  style="font:Georgia;font-size: 15px; float:left;color:red">BACK</a>    
        </h4>
<center>
<h1>List of Visitors...</h1>

 <div class="container">
 
  <table class="table table-striped">
   <thead class="thead-dark">
    <th scope="row">ID</th>
    <th scope="row">Name</th>
    <th scope="row">Contact</th>
    <th scope="row">Address</th>
    <th scope="row">Relation</th>
    <th scope="row">Purpose</th>
   
     <th scope="row">Update</th>
      <th scope="row">Delete</th>
   </thead>
   <tbody>
    <c:forEach items="${visitorlist}" var="w" >
     <tr>
     <td>${w.id}</td>
      <td>${w.name}</td>
      <td>${w.contact}</td>
        <td>${w.address}</td>
          <td>${w.relation}</td>
            <td>${w.purpose}</td>
           
               <td>
      
       <spring:url value="editWarden${w.id}" var="editURL" />
       <a class="btn btn-info" href="${editURL}" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="deletevisitor/${w.id}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <br> <br>
 </div>
 </center>
</body>
</html>
