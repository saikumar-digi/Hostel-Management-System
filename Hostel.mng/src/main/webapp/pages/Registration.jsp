<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>



<center>
<form  action="/details" method="post" >



<h1>Sign Up...</h1>
<fieldset style="width: 500px">



Enter FirstName: <input required="required" type = "text" placeholder="Enter FirstName" , name = "firstName">  <br> <br>
Enter LastName: <input  type = "text" placeholder="Enter LastName" , name="lastName"><br>  <br>
Enter age: <input required="required" type = "number" placeholder="Enter age" , name="age"><br>  <br>
Enter gender: <input  required="required" type = "text" placeholder="Enter gender" , name="gender"><br>  <br>
Enter mobileNo: <input required="required" type = "text" placeholder="Enter Mobileno" , name="mobileNo"> <br>  <br>

Enter EmailId: <input required="required" type = "text" placeholder="Enter Email " , name="email" >   <br>    <br>
Enter Password: <input required="required" type = "text" placeholder="Enter password" , name="password" >   <br>    <br>
<input type="submit" value="submit">




</fieldset>




</form>
</center>



</body>
</html>