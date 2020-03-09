<%-- 
    Document   : InvesigationOfficerHome
    Created on : Feb 23, 2020, 9:32:02 PM
    Author     : RengaNayagi
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Officer Home</title>        
<link rel="stylesheet" type="text/css" href="NavigationBar.css">
<style>
.container {
  padding: 16px;
  background-color: #DCDCDC;
  position: relative;
  transform: translate(65%,0%);
}
input[type=text], input[type=password] {
  width: 95%;
  padding: 14px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #ddd;
}
form
{
   max-width: 600px;
}
input[type=text]:focus,  input[type=password]:focus{
  background-color:#F8F8FF ;
  outline: none;
}
button {
  background-color: black;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: Auto;
  opacity: 0.9; 
  -webkit-transition: width 2s; 
  transition: width 2s;
}

button:hover {
  width: 100px;
  height:60px;
}
a {
  color: dodgerblue;
}
</style>
</head>
<body >
 <ul>
     <li><a href="InvestigationOfficerHome.jsp">Home</a></li>
      <li><a href="#">View Case</a></li>
      <li><a href="#">Add Suspect</a></li>
      <li><a href="#">Add Evidence</a></li>
      <li><a href="#">View Evidence</a></li>
      <li><a href="#">Suspect Criminal Records</a></li>
      <li><a href="#">Contact Us</a></li>
      <li style="float:right"><a href="logout.jsp">Sign-out</a></li>

    </ul>
</body>
</html>