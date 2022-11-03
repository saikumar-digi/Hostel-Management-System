<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<%@ page import="java.lang.Class" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Transcations</title>
<style>
body {
background-image: url("../pages/img/rom.jpg");
background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;
}
</style>
</head>
<body>

    <CENTER>
                <h4>
        <a href="Warden"  style="font:Georgia;font-size: 15px; float:left;color:red">BACK</a>    
        </h4>
    <br/>
<h1 style="color: black;"><ins> Allotment  List</ins></h1>
</CENTER>

<CENTER>
        <table border="3">
               <thead>
<tr>
<th>applicationId</th>
<th>firstName</th>
<th>email </th>
<th>roomNo</th>
<th>feeStatus </th>
<th>Update</th>
<th>Delete</th>
</tr>
</thead>
        
        
        
        
        
        
 

<tbody>



 <c:forEach items="${allotlist}" var="w" >
     <tr>
     <td>${w.applicationId}</td>
     <td>${w.firstName}</td>
     <td>${w.email}</td>
      <td>${w.roomNo}</td>
      <td>${w.allotmentDate}</td>
      
           
           
             <td> 
    <spring:url value="sdvs${w.applicationId}" var="editURL" />
       <a class="btn btn-info" href="${editURL}" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="deleteallot/${w.applicationId}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
             </tbody>
                              
        </table>
        
        
        </CENTER>
       
</body>
</html>