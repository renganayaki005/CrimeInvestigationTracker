<%-- 
    Document   : AddOfficer
    Created on : Feb 23, 2020, 11:23:41 PM
    Author     : RengaNayagi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Officer</title>
<script type="text/javascript">
    function validate()
    {
        var status=true;
        var Phone =/^\d{10}$/;
        var atposition=document.register.email.value.indexOf("@");  
        var dotposition=document.register.email.value.lastIndexOf(".");  
        if(document.register.location.value=="")
        {
            document.getElementById("locationfield").innerHTML="Please choose a location";
            document.register.location.focus();
            status=false;
        }
        else
        {
            document.getElementById("locationfield").innerHTML="";
        }
        if(document.register.email.value=="")
        { 
              document.getElementById("emailfield").innerHTML="Please enter an email";
              document.register.email.focus();
              status=false;
         }
        else if(atposition<1 || dotposition<atposition+2 || dotposition+2>=document.register.email.value.length)
           {  
             document.getElementById("emailfield").innerHTML="Please enter a valid email(abc@mail.com)";
             register.email.focus();
             status=false;  
           }
        else
        {
             document.getElementById("emailfield").innerHTML="";
        }
        if(document.register.contactNo.value=="")
        {
            document.getElementById("contactNofield").innerHTML="Please enter a contact number";
            document.register.contactNo.focus();
            status=false;
        }
        else if(document.register.contactNo.value.match(Phone))
        {
            document.getElementById("contactNofield").innerHTML="";
        }
        else
        {
            document.getElementById("contactNofield").innerHTML="Please enter a valid contact number";
            document.register.contactNo.focus();
            status=false;
        }
        if(document.register.orgName.value=="")
        {
            document.getElementById("orgNamefield").innerHTML="Please enter the organization name";
            document.register.orgName.focus();
            status=false;
        }
        else
        {
            document.getElementById("orgNamefield").innerHTML="";
        }
        if(document.register.password.value=="")
        {
           document.getElementById("passwordfield").innerHTML="Please enter a password";
           document.register.password.focus();
           status=false;
        }
        else if(document.register.password.value.length<6||document.register.password.value.length>15)
        {
           document.getElementById("passwordfield").innerHTML="Please enter a password length of 6-15";
           document.register.password.focus();
           status=false;
        }
        else
        {
          document.getElementById("passwordfield").innerHTML="";
        }
        if(document.register.repeatPassword.value=="")
        {
          document.getElementById("repeatPasswordfield").innerHTML="Please re-enter password";
          document.register.repeatPassword.focus();
          status=false;
        }
        else if(document.register.password.value!=document.register.repeatPassword.value){
        document.getElementById("repeatPasswordfield").innerHTML="Passwords does not match";
        status=false;
        }
        else
        {
         document.getElementById("repeatPasswordfield").innerHTML="";
        }
        if(document.register.registeredNo.value=="")
        {
            document.getElementById("registeredNofield").innerHTML="Please enter the registered number";
            document.register.registeredNo.focus();
            status=false;
        }
        else
        {
            document.getElementById("registeredNofield").innerHTML="";
        }
        return status;
    }
    function checkExist()
    {
        var xmlhttp = new XMLHttpRequest();
         
        var registeredNo= document.register.registeredNo.value;
        var url= "NGOexist.jsp?registeredNo=" + registeredNo;
  
        xmlhttp.onreadystatechange = function(){
               
          if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
                document.getElementById("registeredNofield").innerHTML=xmlhttp.responseText;
        }
      };
      try{
      xmlhttp.open("GET",url,true);
      xmlhttp.send();
         }catch(e){
                alert("Server failed to connect");
            }
    }
</script>
<link rel="stylesheet" type="text/css" href="NavigationBar.css">
<style>
.container {
  padding: 16px;
  background-color: #DCDCDC;
  position: relative;
  transform: translate(65%,0%);
}
input[type=text], input[type=password],input[type=number],select {
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
input[type=text]:focus, input[type=number]:focus, input[type=password]:focus, input[type=date]:focus, textarea:focus,select:focus{
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
     <li><a href="AdminHome.jsp">Home</a></li>
      <li><a href="#">Add Officer</a></li>
      <li><a href="viewOfficer.jsp">View Officer</a></li> 
      <li><a href="#">Add Case</a></li>
      <li><a href="#">Track Case</a></li>
      <li><a href="#">Remove Officer</a></li>
      <li><a href="#">Remove Case</a></li>
      <li><a href="#">Assign Case</a></li>
      <li><a href="#">Contact Us</a></li>
      <li style="float:right"><a href="logout.jsp">Sign-out</a></li>

    </ul>
    <form action="officerAddProcess.jsp"  method="post" name="register" onsubmit="return validate()">
     <br/><br/>
     <div class="container">
        <h1>Add Officer!!!</h1>
        <label for="NameLabel"><b>Name</b></label>
        <input type="text" placeholder="Name" name="name" onblur="checkExist()">
        <span id="registeredNofield" style="color:red"></span>

        <br/><label for="AgencyLabel"><b>Agency Name</b></label>
        <input type="text" placeholder="Agency Name" name="agencyName"/>
         <span id="orgNamefield" style="color:red"></span>
         
         <br/><label for="DeptLabel"><b>Department Name Name</b></label>
        <input type="text" placeholder="Department Id" name="deptId"/>
         <span id="orgNamefield" style="color:red"></span>

         <br/><label for="contactNoLabel"><b>Contact Number</b></label>
        <input type="number" placeholder="Contact Number" name="contactNo"/>
         <span id="contactNofield" style="color:red"></span>

         <br/><label for="emailLabel"><b>Email</b></label>
        <input type="text" placeholder="Email" name="email"/>
        <span id="emailfield" style="color:red"></span>
        
        <br/><label for="officerTypeLabel"><b>Officer Type</b></label>
        <select name="officerType">
             <option value="" disabled=disabled selected>select...</option>
             <option value="InvestigationOfficer">Investigation Officer</option>
             <option value="ForensicOfficer">Forensic Officer</option>
         </select>
        <span id="emailfield" style="color:red"></span>

        <br/><label for="locationLabel"><b>Location</b></label>
         <select name="location">
             <option value="" disabled=disabled selected>select...</option>
             <option value="TamilNadu">Tamil Nadu</option>
             <option value="Telangana">Telangana</option> 
             <option value="Andhra Pradesh">Andhra Pradesh</option>
             <option value="Karnataka">Karnataka</option>
             <option value="Kerala">Kerala</option>
             <option value="Madhya Pradesh">Madhya Pradesh</option>
             <option value="Haryana">Haryana</option>
             <option value="Delhi">Delhi</option>
             <option value="Gujarat">Gujarat</option>
             <option value="Rajasthan">Rajasthan</option>
     </select>
     <span id="locationfield" style="color:red"></span>

     <br/><button type="submit">Submit</button>
     <button type="reset">Reset</button>
   </div>
</form>
</body>
</html>