<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Fundraiser</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body style="background-color:lightcyan;">
<div class="container">

  <spring:url value="/addHostel" var="addURL" />
  <center>
  <a href="addHostel"><h2 style="color:red;">Add Hostel</h2></a>
  </center>
  <form:form modelAttribute="hostelfrom" method="post" action="${addURL}" cssClass="form" >
   
   <div class="form-group">
    <div class="form-group">
    <label>Hostel No</label>
    <form:input path="hostelNo" cssClass="form-control" id="hostelNo" />
   </div>
 <div class="form-group">
    <label>Hostel Name</label>
    <form:input path="hostelName" cssClass="form-control" id="hostelName" />
   </div>
     <div class="form-group">
    <label>Hostel type</label>
    <form:input path="hostelType" cssClass="form-control" id="hostelType" />
   </div>
   <div class="form-group">
    <label>Hostel Contact</label>
    <form:input path="hostelContact" cssClass="form-control" id="hostelContact" />
   </div>
    <div class="form-group">
    <label>Hostel Address</label>
    <form:input path="hostelAddress" cssClass="form-control" id="hostelAddress" />
   </div>
 
   <div class="form-group">
    <label>Hostel Description</label>
    <form:input path="hostelDescription" cssClass="form-control" id="hostelDescription" />
   </div>
      <div class="form-group">
    <label>Hostel Fee</label>
    <form:input path="hostelFee" cssClass="form-control" id="hostelFee" />
   </div>
  
    
   <center>
<button type="submit" class="btn btn-success">Add Hostel</button>
</center>
  </form:form>
  
</div>
</body>
</html>