<%-- 
    Document   : logout.jsp
    Created on : Feb 23, 2020, 11:04:20 PM
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
        <%
            session.invalidate();
            response.sendRedirect("Home.jsp");
            
        %>
    </body>
</html>
