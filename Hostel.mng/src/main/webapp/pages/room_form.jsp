<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Room</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body style="background-color:lightcyan;">
<div class="container">

  <spring:url value="/addRoom" var="addURL" />
  <center>
  <a href="addRoom"><h2 style="color:red;">Add Room</h2></a>
  </center>
  <form:form modelAttribute="roomform" method="post" action="${addURL}" cssClass="form" >
   <div class="form-group">
    <label>roomNo</label>
    <form:input path="roomNo" cssClass="form-control" id="roomNo" />
   </div>
     <div class="form-group">
    <label>roomType </label>
    <form:input path="roomType" cssClass="form-control" id="roomType" />
   </div>
   <div class="form-group">
    <label>status</label>
    <form:input path="status" cssClass="form-control" id="status" />
   </div>

    
   <center>
<button type="submit" class="btn btn-success">Add Room</button>
</center>
  </form:form>
  
</div>
</body>
</html>