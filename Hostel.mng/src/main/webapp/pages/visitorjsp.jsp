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



<center>
<form  action="/details1" method="post" >



<h1>Enter Visitor Details ...</h1>
<fieldset style="width: 500px">



Enter Visitor Name: <input required="required" type = "text" , name = "name">  <br> <br>
Enter Visitor ContactNo: <input  type = "text" , name="contactNo"><br>  <br>

Enter Visitor Address: <input  required="required" type = "text" , name="address"><br>  <br>

Enter Visitor Relation: <input required="required" type = "text"  , name="relation" >   <br>    <br>
Enter visitor purpose: <input required="required" type = "text" , name="purpose" >   <br>    <br>
<input type="submit" value="submit">




</fieldset>




</form>
</center>



</body>
</html>