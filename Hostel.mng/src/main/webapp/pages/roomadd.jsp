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


                <h4>
        <a href="Admin"  style="font:Georgia;font-size: 15px; float:left;color:red">BACK</a>    
        </h4>
        <center>
<form  action="roomDetails" method="post" >



<h1>Enter The Room Details...</h1>
<fieldset style="width: 500px">


<input required="required" type = "number" placeholder="Enter RoomNo" , name="roomNo">  <br> <br>
<input required="required" type = "text" placeholder="Enter Room Type" , name="roomType">  <br> <br>

<input required="required" type = "text" placeholder="Room Status" , name="status"><br>  <br>

   <br>    <br>
<input type="submit" value="submit">




</fieldset>




</form>
</center>

</body>
</html>