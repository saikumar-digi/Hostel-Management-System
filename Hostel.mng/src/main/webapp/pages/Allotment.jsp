<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Room Details</title>
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
<center>
<h1>My Room Details</h1>
</center>
<h3>Name: ${allotment.firstName}</h3>
<h3>Email: ${allotment.email}</h3>
<h3>My RoomNo: ${allotment.roomNo}</h3>
<h3>Allotment Date: ${allotment.allotmentDate}</h3>

</body>
</html>