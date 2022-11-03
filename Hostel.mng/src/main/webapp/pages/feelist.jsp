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
<h1 style="color: black;"><ins>Payment List	</ins></h1>
</CENTER>

<CENTER>
        <table border="3">
               <thead>
<tr>
<th>FeeId</th>
<th>FirstName</th>
<th>Email </th>
<th>RoomNo</th>
<th>Feedate </th>

<th>Totalfee </th>
<th>Paidfee</th>
<th>Remainingfee </th>

</tr>
</thead>
        
        
        
        
        
        
 

<tbody>



 <c:forEach items="${feelist}" var="w" >
     <tr>
     <td>${w.feeId}</td>
     <td>${w.firstName}</td>
     <td>${w.email}</td>
      <td>${w.roomNo}</td>
      <td>${w.feedate}</td>
      <td>${w.totalfee}</td>
      <td>${w.paidfee}</td>
      <td>${w.remainingfee}</td>
      
           
           
     </tr>
    </c:forEach>
             </tbody>
                              
        </table>
        
       
        </CENTER>
       
</body>
</html>