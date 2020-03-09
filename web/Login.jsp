<%-- 
    Document   : Login
    Created on : Feb 23, 2020, 9:15:31 PM
    Author     : RengaNayagi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign-In</title>
        <script type="text/javascript">
       function validate()
       {
           var status=true;
           if(document.login.password.value=="")
        {
            document.getElementById("passwordfield").innerHTML="Please enter a password";
            document.login.password.focus();
            status=false;
        }
        else
        {
            document.getElementById("passwordfield").innerHTML="";
        }
        if(document.login.Id.value=="")
        {
            document.getElementById("Idfield").innerHTML="Please enter an Id";
            document.login.NGOId.focus();
            status=false;
        }
        else
        {
            document.getElementById("passwordfield").innerHTML="";
        }
        return status;
       }
       function check()
        {
        var xmlhttp = new XMLHttpRequest();
         
        var Id= document.login.Id.value;
        var url= "IdCheck.jsp?Id=" + Id;
       if(document.login.Id.value!=""){
        xmlhttp.onreadystatechange = function(){
               
          if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
              
                document.getElementById("Idfield").innerHTML=xmlhttp.responseText;
        }
      };
      try{
      xmlhttp.open("GET",url,true);
      xmlhttp.send();
         }catch(e){
                alert("Server failed to connect");
            }
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
     <li><a href="Home.jsp">Home</a></li> 
      <li style="float:right"><a href="Login.jsp">Sign-In</a></li>
       <li style="float:right"><a href="#">Contact Us</a></li>   
 </ul>
    <form action="LoginCheck.jsp"  method="post" name="login" onsubmit="return validate()">
     <br/><br/>
     <div class="container">
        <h1>Sign In!!!</h1>
        <span id="error" style="color:red"></span>
        <label for="IdLabel"><b>ID</b></label>
        <input type="text" placeholder="ID" name="Id" onblur="check()">
        <span id="Idfield" style="color:red"></span>
        
        <br/><label for="passwordLabel"><b>Password</b></label>
        <input type="password" placeholder="Password" name="password">
        <span id="passwordfield" style="color:red"></span><br/>
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
             </div>
    </form>
</body>
</html>