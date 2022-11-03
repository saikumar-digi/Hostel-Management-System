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

  <spring:url value="/addWarden" var="addURL" />
  <center>
  <a href="addWarden"><h2 style="color:red;">Add Warden</h2></a>
  </center>
  <form:form modelAttribute="wardenfrom" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>name</label>
    <form:input path="name" cssClass="form-control" id="name" />
   </div>
     <div class="form-group">
    <label>contact Name</label>
    <form:input path="contact" cssClass="form-control" id="contact" />
   </div>
   <div class="form-group">
    <label>email</label>
    <form:input path="email" cssClass="form-control" id="email" />
   </div>
    <div class="form-group">
    <label>age</label>
    <form:input path="age" cssClass="form-control" id="age" />
   </div>
 
   <div class="form-group">
    <label>gender</label>
    <form:input path="gender" cssClass="form-control" id="gender" />
   </div>
      <div class="form-group">
    <label>city</label>
    <form:input path="city" cssClass="form-control" id="city" />
   </div>
      <div class="form-group">
    <label>address</label>
    <form:input path="address" cssClass="form-control" id="address" />
   </div>
    
   <center>
<button type="submit" class="btn btn-success">Add Warden</button>
</center>
  </form:form>
  
</div>
</body>
</html>