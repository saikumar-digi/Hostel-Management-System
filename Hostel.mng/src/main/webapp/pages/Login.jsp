<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
background-image: url("../pages/img/hostell.jpg");
background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;
}
</style>


</head>
<body><center>



<fieldset style="width:400px; background-color: #87CEEB ">
<h1  style="color:black;"><b>Student Login  Page</b></h1>
<hr>
<br>

<form action="studentvalidation" method="post">

Email    <input required="required" type="text" name="email" placeholder="Enter Your Email"> <br>   </br>
Password <input required type="password"  name="password"placeholder="Enter Your Password">  <br>  </br>
<input type="submit" value="login">
<c:if test="${not empty error }">
<h4>${error}</h4>
</c:if>

</form>
<br><br>
<hr>
<form action="Create"method="get">
  <input type="submit" value="Create New Account">
 </form>

</fieldset>

</center>
</body>
</html>
