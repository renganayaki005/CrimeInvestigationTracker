<%-- 
    Document   : viewOfficer
    Created on : Feb 24, 2020, 12:44:40 AM
    Author     : RengaNayagi
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Officer Details</title>
        <link rel="stylesheet" type="text/css" href="NavigationBar.css">
    </head>
    <body>
        <%

           if(session.getAttribute("Id")==null)
           {  
    %>
    <ul>
      <li><a href="Home.jsp">Home</a></li>
      <li><a href="#">Contact Us</a></li>
      <li style="float:right"><a href="Login.jsp">Sign-In</a></li>
    </ul>
    <%
           }
           else
           {
           %>
           <ul>
     <li><a href="AdminHome.jsp">Home</a></li>
      <li><a href="AddOfficer.jsp">Add Officer</a></li>
      <li><a href="viewOfficer.jsp">View Officer</a></li>      
      <li><a href="#">Add Case</a></li>
      <li><a href="#">Track Case</a></li>
      <li><a href="#">Remove Officer</a></li>
      <li><a href="#">Remove Case</a></li>
      <li><a href="#">Assign Case</a></li>
      <li><a href="#">Contact Us</a></li>
      <li style="float:right"><a href="logout.jsp">Sign-out</a></li>

    </ul>
    <strong>Welcome</strong> ${sessionScope.Id}
    <%
           }
    %>
    <%
      Class.forName("oracle.jdbc.driver.OracleDriver");     
   Connection con=(Connection)DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","renga");
   PreparedStatement pstmt=con.prepareCall("select * from InvestigationOfficer");
   ResultSet rs=pstmt.executeQuery();%>
   <br/><br/>
   <center>
    <h1>Investigation Officer</h1>
    <table border="1">
        <tr>
            <th>officer Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone Number</th>
            <th>Agency</th>
            <th>Dept</th>          
        </tr>
        <%
   while(rs.next()){
   %>
   
        <tr>
           <td><%out.print(rs.getString("officerId"));%></td>
           <td><%out.print(rs.getString("name"));%></td>
           <td><%out.print(rs.getString("email"));%></td>
           <td><%out.print(rs.getString("phoneNo"));%></td>
           <td><%out.print(rs.getString("agencyName"));%></td>
           <td><%out.print(rs.getString("deptId"));%></td>
        </tr>
       
           <%
   }
    %> </table><%
   
   pstmt=con.prepareCall("select * from ForensicOfficer");
   rs=pstmt.executeQuery(); %>   
   <br/><br/>
   <h1>Forensic Officer</h1>
    <table border="1">
        <tr>
            <th>officer Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone Number</th>
            <th>Agency</th>
            <th>Dept</th>          
        </tr> <%
   while(rs.next()){
   %>
   
        <tr>
           <td><%out.print(rs.getString("officerId"));%></td>
           <td><%out.print(rs.getString("name"));%></td>
           <td><%out.print(rs.getString("email"));%></td>
           <td><%out.print(rs.getString("phoneNo"));%></td>
           <td><%out.print(rs.getString("agencyName"));%></td>
           <td><%out.print(rs.getString("deptId"));%></td>
        </tr>
         
           <%
   }
  %> </table><%
  
   %>
   
 
</center>   
 </body>
</html>
