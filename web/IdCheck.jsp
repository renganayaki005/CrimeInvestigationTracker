<%-- 
    Document   : IdCheck
    Created on : Feb 23, 2020, 9:24:06 PM
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
   Class.forName("oracle.jdbc.driver.OracleDriver");     
   Connection con=(Connection)DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","renga");
   PreparedStatement pstmt=con.prepareCall("select * from Login where Id= ?");
   pstmt.setString(1, request.getParameter("Id"));
   ResultSet rs=pstmt.executeQuery();
   if(rs.next()){
      out.println("");
      }
   else{
      out.println("Invalid ID does not exist");
   }
   }catch(Exception e)
   {
       System.out.println(e);
   }
%>
