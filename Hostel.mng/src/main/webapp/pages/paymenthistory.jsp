<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<h1>My Payment History</h1>
</center>




<body>
<h3>Name: ${fee.firstName}</h3>
<h3>Email: ${fee.email}</h3>
<%-- <h3>My RoomNo: ${fee.roomNo}</h3> --%>
<h3>Fee Paid Date: ${fee.feedate}</h3>
<h3>Total Fee: ${fee.totalfee}</h3>
<h3>Paid Fee: ${fee.paidfee}</h3>
<h3>Remaining Fee: ${fee.remainingfee}</h3>
</body>
</html>