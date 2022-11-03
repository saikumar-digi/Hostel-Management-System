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
background-image: url("../pages/img/rom.jpg");
background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;
}
</style>
<body style="background-color:">
<center>
<h1>Hostel's List</h1>
<br>
</center>
 <div class="container">
 
  <table class="table table-striped">
   <thead class="thead-dark">
    <th scope="row" style="color: yellow;">hostelNo</th>
    <th scope="row" style="color: yellow;">hostelName </th>
     <th scope="row" style="color: yellow;">hostelType</th>
    <th scope="row" style="color: yellow;">hostelContact</th>
    <th scope="row" style="color: yellow;">hostelAddress</th>
    <th scope="row" style="color: yellow;">hostelDescription</th>
     <th scope="row" style="color: yellow;">hostelFee</th>
             
                
  
   </thead>
   <tbody>
    <c:forEach items="${hostellist}" var="war" >
     <tr>
      <td>${war.hostelNo}</td>
      <td>${war.hostelName}</td>
      <td>${war.hostelType}</td>
      <td>${war.hostelContact}</td>
      <td>${war.hostelAddress}</td>
      <td>${war.hostelDescription}</td>
      <td>${war.hostelFee}</td>
      
     
    
     </tr>
    </c:forEach>
   </tbody>
  </table>
  
 
 </div>
</body>
</html>