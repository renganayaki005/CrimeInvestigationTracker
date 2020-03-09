package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign-In</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("       function validate()\n");
      out.write("       {\n");
      out.write("           var status=true;\n");
      out.write("           if(document.login.password.value==\"\")\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"passwordfield\").innerHTML=\"Please enter a password\";\n");
      out.write("            document.login.password.focus();\n");
      out.write("            status=false;\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"passwordfield\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("        if(document.login.Id.value==\"\")\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"Idfield\").innerHTML=\"Please enter an Id\";\n");
      out.write("            document.login.NGOId.focus();\n");
      out.write("            status=false;\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"passwordfield\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("        return status;\n");
      out.write("       }\n");
      out.write("       function check()\n");
      out.write("        {\n");
      out.write("        var xmlhttp = new XMLHttpRequest();\n");
      out.write("         \n");
      out.write("        var Id= document.login.Id.value;\n");
      out.write("        var url= \"IdCheck.jsp?Id=\" + Id;\n");
      out.write("       if(document.login.Id.value!=\"\"){\n");
      out.write("        xmlhttp.onreadystatechange = function(){\n");
      out.write("               \n");
      out.write("          if(xmlhttp.readyState == 4 && xmlhttp.status == 200){\n");
      out.write("              \n");
      out.write("                document.getElementById(\"Idfield\").innerHTML=xmlhttp.responseText;\n");
      out.write("        }\n");
      out.write("      };\n");
      out.write("      try{\n");
      out.write("      xmlhttp.open(\"GET\",url,true);\n");
      out.write("      xmlhttp.send();\n");
      out.write("         }catch(e){\n");
      out.write("                alert(\"Server failed to connect\");\n");
      out.write("            }\n");
      out.write("    }\n");
      out.write("        }\n");
      out.write("</script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"NavigationBar.css\">\n");
      out.write("<style>\n");
      out.write(".container {\n");
      out.write("  padding: 16px;\n");
      out.write("  background-color: #DCDCDC;\n");
      out.write("  position: relative;\n");
      out.write("  transform: translate(65%,0%);\n");
      out.write("}\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("  width: 95%;\n");
      out.write("  padding: 14px;\n");
      out.write("  margin: 5px 0 22px 0;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: none;\n");
      out.write("  background: #ddd;\n");
      out.write("}\n");
      out.write("form\n");
      out.write("{\n");
      out.write("   max-width: 600px;\n");
      out.write("}\n");
      out.write("input[type=text]:focus,  input[type=password]:focus{\n");
      out.write("  background-color:#F8F8FF ;\n");
      out.write("  outline: none;\n");
      out.write("}\n");
      out.write("button {\n");
      out.write("  background-color: black;\n");
      out.write("  color: white;\n");
      out.write("  padding: 16px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: Auto;\n");
      out.write("  opacity: 0.9; \n");
      out.write("  -webkit-transition: width 2s; \n");
      out.write("  transition: width 2s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("  width: 100px;\n");
      out.write("  height:60px;\n");
      out.write("}\n");
      out.write("a {\n");
      out.write("  color: dodgerblue;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write(" <ul>\n");
      out.write("     <li><a href=\"Home.jsp\">Home</a></li> \n");
      out.write("      <li style=\"float:right\"><a href=\"Login.jsp\">Sign-In</a></li>\n");
      out.write("       <li style=\"float:right\"><a href=\"#\">Contact Us</a></li>   \n");
      out.write(" </ul>\n");
      out.write("    <form action=\"LoginCheck.jsp\"  method=\"post\" name=\"login\" onsubmit=\"return validate()\">\n");
      out.write("     <br/><br/>\n");
      out.write("     <div class=\"container\">\n");
      out.write("        <h1>Sign In!!!</h1>\n");
      out.write("        <span id=\"error\" style=\"color:red\"></span>\n");
      out.write("        <label for=\"IdLabel\"><b>ID</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"ID\" name=\"Id\" onblur=\"check()\">\n");
      out.write("        <span id=\"Idfield\" style=\"color:red\"></span>\n");
      out.write("        \n");
      out.write("        <br/><label for=\"passwordLabel\"><b>Password</b></label>\n");
      out.write("        <input type=\"password\" placeholder=\"Password\" name=\"password\">\n");
      out.write("        <span id=\"passwordfield\" style=\"color:red\"></span><br/>\n");
      out.write("        <button type=\"submit\">Submit</button>\n");
      out.write("        <button type=\"reset\">Reset</button>\n");
      out.write("             </div>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>");
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
