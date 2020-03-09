<%-- 
    Document   : LoginCheck
    Created on : Feb 23, 2020, 9:26:57 PM
    Author     : RengaNayagi
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   try{
   String Id=request.getParameter("Id");
   String pwd=request.getParameter("password");
   Class.forName("oracle.jdbc.driver.OracleDriver");     
   out.println("working");
   Connection con=(Connection)DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","renga");
   PreparedStatement pstmt=con.prepareCall("select * from Login where Id= ?");
   pstmt.setString(1,Id );
   ResultSet rs=pstmt.executeQuery();
   if(rs.next()){
       if((rs.getString("usertype").equals("Admin"))){
           pstmt=con.prepareCall("select * from admin where AdminId= ?");
           pstmt.setString(1,Id );
           rs=pstmt.executeQuery();
           if(rs.next()){
      if(pwd.equals(rs.getString("password")))
      {
          session.setAttribute("Id",Id);
          session.setAttribute("type", "Admin");
          response.sendRedirect("AdminHome.jsp");
        }
      else{
           //invalid password
          response.sendRedirect("Login.jsp");
       }
      }
          
       }
       else if(rs.getString("usertype").equals("InvestigationOfficer")){
           pstmt=con.prepareCall("select * from InvestigationOfficer where officerId= ? ");
           pstmt.setString(1, Id);
           rs=pstmt.executeQuery();
           if(rs.next()){
           if(pwd.equals(rs.getString("password")))
      {
               out.println("Working");
          session.setAttribute( "Id",Id);
          session.setAttribute("type", "InvestigationOfficer");
          response.sendRedirect("InvestigationOfficerHome.jsp");
        }
      else{
           //invalid password
            response.sendRedirect("Login.jsp");
       }
           }   
       }
       else if(rs.getString("usertype").equals("ForensicOfficer")){
           pstmt=con.prepareCall("select * from ForensicOfficer where officerId= ? ");
           pstmt.setString(1, Id);      
           rs=pstmt.executeQuery();
           if(rs.next())
           {
           if(pwd.equals(rs.getString("password")))
      {
          session.setAttribute("Id",Id);
          session.setAttribute("type","ForensicOfficer" );
          response.sendRedirect("ForensicOfficerHome.jsp");
        }
      else{
           //invalid password
            response.sendRedirect("Login.jsp");
       }
           }
           
       }
   }
   else
   {
       //no such Id exists in userlogin
       response.sendRedirect("Login.jsp");
   }
   }catch(Exception e)
   {
       System.out.println(e);
   }       
%>