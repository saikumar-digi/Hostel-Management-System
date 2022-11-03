<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
background-image: url("../pages/img/ss.jpg");
background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;
}
</style>
</head>
<body>

  <spring:url value="/addHostel" var="addURL" />
  <center>
  <a href="addHostel"><h2 style="color:red;">Add Warden</h2></a>
  </center>
  <form:form modelAttribute="hostelfrom" method="post" action="${addURL}" cssClass="form" >


                <h4>
        <a href="Admin"  style="font:Georgia;font-size: 15px; float:left;color:red">BACK</a>    
        </h4>
<center>
<form  action="/hostelDetails" method="post" >



<h1>Enter The Hostel Details...</h1>
<fieldset style="width: 500px">



Enter Hostel Name: <input required="required" type = "text" placeholder="Enter Name" , name = "hostelName">  <br> <br>
Enter Hostel  Type: <input  type = "text" placeholder="Type" , name="hostelType"><br>  <br>
Enter Hostel  ContactNo: <input required="required" type = "number" placeholder="ContactNo" , name="hostelContact"><br>  <br>
Enter Hostel  Description: <input  required="required" type = "text" placeholder="description" , name="hostelDescription"><br>  <br>
Enter Hostel  Address: <input required="required" type = "text" placeholder="Address" , name="hostelAddress"> <br>  <br>

Enter Hostel  fee: <input required="required" type = "text" placeholder="fee" , name="hostelFee" >   <br>    <br>
   <br>    <br>
<input type="submit" value="submit">
</form:form>



</fieldset>




</form>
</center>

</body>
</html>