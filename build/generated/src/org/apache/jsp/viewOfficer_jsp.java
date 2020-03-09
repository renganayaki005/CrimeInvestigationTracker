package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewOfficer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Officer Details</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"NavigationBar.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");


           if(session.getAttribute("Id")==null)
           {  
    
      out.write("\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("      <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("      <li style=\"float:right\"><a href=\"Login.jsp\">Sign-In</a></li>\n");
      out.write("    </ul>\n");
      out.write("    ");

           }
           else
           {
           
      out.write("\n");
      out.write("           <ul>\n");
      out.write("     <li><a href=\"AdminHome.jsp\">Home</a></li>\n");
      out.write("      <li><a href=\"AddOfficer.jsp\">Add Officer</a></li>\n");
      out.write("      <li><a href=\"viewOfficer.jsp\">View Officer</a></li>      \n");
      out.write("      <li><a href=\"#\">Add Case</a></li>\n");
      out.write("      <li><a href=\"#\">Track Case</a></li>\n");
      out.write("      <li><a href=\"#\">Remove Officer</a></li>\n");
      out.write("      <li><a href=\"#\">Remove Case</a></li>\n");
      out.write("      <li><a href=\"#\">Assign Case</a></li>\n");
      out.write("      <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("      <li style=\"float:right\"><a href=\"logout.jsp\">Sign-out</a></li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("    <strong>Welcome</strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("    ");

           }
    
      out.write("\n");
      out.write("    ");

      Class.forName("oracle.jdbc.driver.OracleDriver");     
   Connection con=(Connection)DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","renga");
   PreparedStatement pstmt=con.prepareCall("select * from InvestigationOfficer");
   ResultSet rs=pstmt.executeQuery();
      out.write("\n");
      out.write("   <br/><br/>\n");
      out.write("   <center>\n");
      out.write("    <h1>Investigation Officer</h1>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <th>officer Id</th>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Phone Number</th>\n");
      out.write("            <th>Agency</th>\n");
      out.write("            <th>Dept</th>          \n");
      out.write("        </tr>\n");
      out.write("        ");

   while(rs.next()){
   
      out.write("\n");
      out.write("   \n");
      out.write("        <tr>\n");
      out.write("           <td>");
out.print(rs.getString("officerId"));
      out.write("</td>\n");
      out.write("           <td>");
out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("           <td>");
out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("           <td>");
out.print(rs.getString("phoneNo"));
      out.write("</td>\n");
      out.write("           <td>");
out.print(rs.getString("agencyName"));
      out.write("</td>\n");
      out.write("           <td>");
out.print(rs.getString("deptId"));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("           ");

   }
    
      out.write(" </table>");

   
   pstmt=con.prepareCall("select * from ForensicOfficer");
   rs=pstmt.executeQuery(); 
      out.write("   \n");
      out.write("   <br/><br/>\n");
      out.write("   <h1>Forensic Officer</h1>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <th>officer Id</th>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Phone Number</th>\n");
      out.write("            <th>Agency</th>\n");
      out.write("            <th>Dept</th>          \n");
      out.write("        </tr> ");

   while(rs.next()){
   
      out.write("\n");
      out.write("   \n");
      out.write("        <tr>\n");
      out.write("           <td>");
out.print(rs.getString("officerId"));
      out.write("</td>\n");
      out.write("           <td>");
out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("           <td>");
out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("           <td>");
out.print(rs.getString("phoneNo"));
      out.write("</td>\n");
      out.write("           <td>");
out.print(rs.getString("agencyName"));
      out.write("</td>\n");
      out.write("           <td>");
out.print(rs.getString("deptId"));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("         \n");
      out.write("           ");

   }
  
      out.write(" </table>");

  
   
      out.write("\n");
      out.write("   \n");
      out.write(" \n");
      out.write("</center>   \n");
      out.write(" </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
