<%-- 
    Document   : officerAddProcess
    Created on : Feb 24, 2020, 12:18:50 AM
    Author     : RengaNayagi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%@page import="java.sql.*"%>
        <%@page import="java.util.Random"%>
       <%
           Random rand = new Random();
           int  n = rand.nextInt(9999) + 1;
           String name=request.getParameter("name");
           int  n1 = rand.nextInt(9999) + 119;
           String password=String.valueOf(n1);
           String agencyName=request.getParameter("agencyName");
           String deptId=request.getParameter("deptId");
           String officerType=request.getParameter("officerType");
           String officerId=name+(String.valueOf(n));
           String email=request.getParameter("email");
           String contactNo=request.getParameter("contactNo");
           String location=request.getParameter("location");
           Class.forName("oracle.jdbc.driver.OracleDriver");  
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","renga"); 
           if(officerType.equals("Investigation Officer"))
           {
           PreparedStatement pstmt=con.prepareStatement("insert into InvestigationOfficer(officerId,password,name,email,phoneNo,agencyName,deptId) values(?,?,?,?,?,?,?)");  
           pstmt.setString(1,officerId);
           pstmt.setString(2,password);
           pstmt.setString(3,name);
           pstmt.setString(4,email);
           pstmt.setString(5,contactNo);
           pstmt.setString(6,agencyName);
           pstmt.setString(7, deptId);
           pstmt.executeUpdate();
           pstmt=con.prepareStatement("insert into Login(id,usertype) values(?,?)");
           pstmt.setString(1, officerId);
           pstmt.setString(2, officerType);
           pstmt.executeUpdate();
           session.setAttribute("Id",officerId);
           response.sendRedirect("AdminHome.jsp");
           }
           else if(officerType.equals("Forensic Officer"))
           {
           PreparedStatement pstmt=con.prepareStatement("insert into ForensicOfficer(officerId,password,name,email,phoneNo,agencyName,deptId) values(?,?,?,?,?,?,?)");  
           pstmt.setString(1,officerId);
           pstmt.setString(2,password);
           pstmt.setString(3,name);
           pstmt.setString(4,email);
           pstmt.setString(5,contactNo);
           pstmt.setString(6,agencyName);
           pstmt.setString(7, deptId);
           pstmt.executeUpdate();
           pstmt=con.prepareStatement("insert into Login(id,email,usertype) values(?,?,?)");
           pstmt.setString(1, officerId);
           pstmt.setString(3, officerType);
           pstmt.executeUpdate();
           session.setAttribute("Id",officerId);
           response.sendRedirect("AdminHome.jsp");
           }
           
           
         %>
    </body>
</html>
