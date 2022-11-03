<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>
body {
background-image: url("../pages/img/bed-142516.jpg");
background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;
}
</style>
</head>
<body>
<center>
<fieldset style="width: 400px; background-color:white">
<center>
<fieldset style="width: 300px; background-color:white">
<h1  style="color:black;"><b>Admin Login Page</b></h1>
</fieldset>

  <form action="/login" method="post">
  
 UserName <input type="text" name="username">
  <br><br>
 Password <input type="text" name="password">
  <br> <br>
  
  <input type="submit" value="AdminLogin">
</form>

</fieldset>

</center>

</body>
</html>