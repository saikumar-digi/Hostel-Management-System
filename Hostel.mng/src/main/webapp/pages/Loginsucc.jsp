<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
background-image: url("../pages/img/s.jpg");
background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;
}
</style>
<style>  
#topnav {
   width: 100%;

   position: fixed;
   top: 0;
   left: 0;

   background-color: Black;

   font-family: Arial, sans-serif;
   font-size: 15px;
}

.nav-link {
   display: inline-block;
   width: 100px;
   height: 55px;

   color: White;

   text-align: center;
   line-height: 55px;

   text-decoration: none;
}

#logo {
   width: 120px;

   background-color: RoyalBlue;

   font-weight: bold;
}

#about {
   position: absolute;
   background-color: green;
   
   top: 0;
   right: 0;
}
</style>  
</head>

<body>
<form action="myprofile" method="post"></form>
  <nav id="topnav">
         <a id="logo" class="nav-link" href="Loginsucc.jsp">Home</a>
         <a class="nav-link" href="hlist2">Hostel List</a>
         <a class="nav-link" href="rlist2">Room List</a>
         <a class="nav-link" href="Sapplication">Application</a>
         <a class="nav-link" href="/studentallotment">Allotments</a>
         <a class="nav-link" href="/paymenthistory">PaymentHistory</a>
         
         
         <a id="about" class="nav-link" href="profile">My Profile</a>
      </nav>

</body>
</html>