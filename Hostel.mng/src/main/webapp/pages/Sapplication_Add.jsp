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
  <a href="addHostel"><h2 style="color:red;">Application form</h2></a>
  </center>
  <form:form modelAttribute="hostelfrom" method="post" action="${addURL}" cssClass="form" >


                <h4>
        <a href="warden4"  style="font:Georgia;font-size: 15px; float:left;color:red">BACK</a>    
        </h4>
<center>
<form  action="/sappicationDetails" method="post" >



<h1>Enter the  Student  Details...</h1>
<fieldset style="width: 500px">



Enter student Name : <input required="required" type = "text" placeholder="studentname" , name = "studentname">  <br> <br>
Enter student MobileNo: <input required="required" type = "number" placeholder="studentMobileNo" , name="studentMobileNo"><br>  <br>
Enter student Email: <input required="required" type = "text" placeholder="studentEmail" , name="studentEmail"><br>  <br>
Enter student Gender: <input  required="required" type = "text" placeholder="studentGender" , name="studentGender"><br>  <br>
Enter student Qualification: <input required="required" type = "text" placeholder="studentQualification" , name="studentQualification"> <br>  <br>
Enter student Age: <input required="required" type = "number" placeholder="studentAge" , name="studentAge" >   <br>    <br>
Enter student City: <input required="required" type = "text" placeholder="studentCity" , name="studentCity" >   <br>    <br>
Enter student Address: <input required="required" type = "text" placeholder="studentAddress" , name="studentAddress" >   <br>    <br>
   <br>    <br>
<input type="submit" value="submit">
</form:form>



</fieldset>




</form>
</center>

</body>
</html>