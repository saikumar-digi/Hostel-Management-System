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
        <a href="Warden"  style="font:Georgia;font-size: 15px; float:left;color:red">BACK</a>    
        </h4>
<center>
<form  action="/feeDetails" method="post" >



<h1>Payment Page...</h1>
<fieldset style="width: 500px">



Enter Student Name: <input required="required" type = "text" placeholder="Enter Name" , name = "firstName">  <br> <br>
Enter Student Email: <input  required = "required" placeholder="email" , name="email"><br>  <br>
Enter   RoomNo : <input required="required" type = "number" placeholder="roomNo" , name="roomNo"><br>  <br>
Enter   Date : <input required="required" type = "date"  name="feedate"><br>  <br>
Enter   RoomNo : <input required="required" type = "number" placeholder="totalfee" , name="totalfee"><br>  <br>
Enter   RoomNo : <input required="required" type = "number" placeholder="paidfee" , name="paidfee"><br>  <br>
Enter   RoomNo : <input required="required" type = "number" placeholder="remainingfee" , name="remainingfee"><br>  <br>


   <br>    <br>
<input type="submit" value="submit">




</fieldset>




</form>
</center>

</body>
</html>