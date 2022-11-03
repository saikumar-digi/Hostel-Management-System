<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
  
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Student Application List</title>
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


<body style="background-color:">

<center>
<h1>Student Application List</h1>
<br>
</center>

 <div class="container">

  <table class="table table-striped">
   <thead class="thead-dark">
    <th scope="row" style="color: yellow;">StudentUserId</th>
    <th scope="row" style="color: yellow;">StudentName</th>
     <th scope="row" style="color: yellow;">StudentMobileNo</th>
    <th scope="row" style="color: yellow;">StudentEmail</th>
    <th scope="row" style="color: yellow;">StudentGender</th>
    <th scope="row" style="color: yellow;">StudentQualification</th>
     <th scope="row" style="color: yellow;">StudentAge</th>
     <th scope="row" style="color: yellow;">StudentCity</th> 
     <th scope="row" style="color: yellow;">StudentAddress</th>               
                
    
   </thead>
   <tbody>
    <c:forEach items="${sapplicationList}" var="war" >
     <tr>
      <td>${war.studentUserId}</td>
      <td>${war.studentname}</td>
      <td>${war.studentMobileNo}</td>
      <td>${war.studentEmail}</td>
      <td>${war.studentGender}</td>
      <td>${war.studentQualification}</td>
      <td>${war.studentAge}</td>
      <td>${war.studentCity}</td>
       <td>${war.studentAddress}</td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
 

  
 </div>
  
</body>
</html>