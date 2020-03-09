package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddOfficer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>Registration</title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function validate()\n");
      out.write("    {\n");
      out.write("        var status=true;\n");
      out.write("        var Phone =/^\\d{10}$/;\n");
      out.write("        var atposition=document.register.email.value.indexOf(\"@\");  \n");
      out.write("        var dotposition=document.register.email.value.lastIndexOf(\".\");  \n");
      out.write("        if(document.register.location.value==\"\")\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"locationfield\").innerHTML=\"Please choose a location\";\n");
      out.write("            document.register.location.focus();\n");
      out.write("            status=false;\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"locationfield\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("        if(document.register.email.value==\"\")\n");
      out.write("        { \n");
      out.write("              document.getElementById(\"emailfield\").innerHTML=\"Please enter an email\";\n");
      out.write("              document.register.email.focus();\n");
      out.write("              status=false;\n");
      out.write("         }\n");
      out.write("        else if(atposition<1 || dotposition<atposition+2 || dotposition+2>=document.register.email.value.length)\n");
      out.write("           {  \n");
      out.write("             document.getElementById(\"emailfield\").innerHTML=\"Please enter a valid email(abc@mail.com)\";\n");
      out.write("             register.email.focus();\n");
      out.write("             status=false;  \n");
      out.write("           }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("             document.getElementById(\"emailfield\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("        if(document.register.contactNo.value==\"\")\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"contactNofield\").innerHTML=\"Please enter a contact number\";\n");
      out.write("            document.register.contactNo.focus();\n");
      out.write("            status=false;\n");
      out.write("        }\n");
      out.write("        else if(document.register.contactNo.value.match(Phone))\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"contactNofield\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"contactNofield\").innerHTML=\"Please enter a valid contact number\";\n");
      out.write("            document.register.contactNo.focus();\n");
      out.write("            status=false;\n");
      out.write("        }\n");
      out.write("        if(document.register.orgName.value==\"\")\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"orgNamefield\").innerHTML=\"Please enter the organization name\";\n");
      out.write("            document.register.orgName.focus();\n");
      out.write("            status=false;\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"orgNamefield\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("        if(document.register.password.value==\"\")\n");
      out.write("        {\n");
      out.write("           document.getElementById(\"passwordfield\").innerHTML=\"Please enter a password\";\n");
      out.write("           document.register.password.focus();\n");
      out.write("           status=false;\n");
      out.write("        }\n");
      out.write("        else if(document.register.password.value.length<6||document.register.password.value.length>15)\n");
      out.write("        {\n");
      out.write("           document.getElementById(\"passwordfield\").innerHTML=\"Please enter a password length of 6-15\";\n");
      out.write("           document.register.password.focus();\n");
      out.write("           status=false;\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("          document.getElementById(\"passwordfield\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("        if(document.register.repeatPassword.value==\"\")\n");
      out.write("        {\n");
      out.write("          document.getElementById(\"repeatPasswordfield\").innerHTML=\"Please re-enter password\";\n");
      out.write("          document.register.repeatPassword.focus();\n");
      out.write("          status=false;\n");
      out.write("        }\n");
      out.write("        else if(document.register.password.value!=document.register.repeatPassword.value){\n");
      out.write("        document.getElementById(\"repeatPasswordfield\").innerHTML=\"Passwords does not match\";\n");
      out.write("        status=false;\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("         document.getElementById(\"repeatPasswordfield\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("        if(document.register.registeredNo.value==\"\")\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"registeredNofield\").innerHTML=\"Please enter the registered number\";\n");
      out.write("            document.register.registeredNo.focus();\n");
      out.write("            status=false;\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"registeredNofield\").innerHTML=\"\";\n");
      out.write("        }\n");
      out.write("        return status;\n");
      out.write("    }\n");
      out.write("    function checkExist()\n");
      out.write("    {\n");
      out.write("        var xmlhttp = new XMLHttpRequest();\n");
      out.write("         \n");
      out.write("        var registeredNo= document.register.registeredNo.value;\n");
      out.write("        var url= \"NGOexist.jsp?registeredNo=\" + registeredNo;\n");
      out.write("  \n");
      out.write("        xmlhttp.onreadystatechange = function(){\n");
      out.write("               \n");
      out.write("          if(xmlhttp.readyState == 4 && xmlhttp.status == 200){\n");
      out.write("                document.getElementById(\"registeredNofield\").innerHTML=xmlhttp.responseText;\n");
      out.write("        }\n");
      out.write("      };\n");
      out.write("      try{\n");
      out.write("      xmlhttp.open(\"GET\",url,true);\n");
      out.write("      xmlhttp.send();\n");
      out.write("         }catch(e){\n");
      out.write("                alert(\"Server failed to connect\");\n");
      out.write("            }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"NavigationBar.css\">\n");
      out.write("<style>\n");
      out.write(".container {\n");
      out.write("  padding: 16px;\n");
      out.write("  background-color: #DCDCDC;\n");
      out.write("  position: relative;\n");
      out.write("  transform: translate(65%,0%);\n");
      out.write("}\n");
      out.write("input[type=text], input[type=password],input[type=number],select {\n");
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
      out.write("input[type=text]:focus, input[type=number]:focus, input[type=password]:focus, input[type=date]:focus, textarea:focus,select:focus{\n");
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
      out.write("     <li><a href=\"AdminHome.jsp\">Home</a></li>\n");
      out.write("      <li><a href=\"#\">Add Officer</a></li>\n");
      out.write("      <li><a href=\"#\">Add Case</a></li>\n");
      out.write("      <li><a href=\"#\">Track Case</a></li>\n");
      out.write("      <li><a href=\"#\">Remove Officer</a></li>\n");
      out.write("      <li><a href=\"#\">Remove Case</a></li>\n");
      out.write("      <li><a href=\"#\">Assign Case</a></li>\n");
      out.write("      <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("      <li style=\"float:right\"><a href=\"logout.jsp\">Sign-out</a></li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("    <form action=\"NGORegProcess.jsp\"  method=\"post\" name=\"register\" onsubmit=\"return validate()\">\n");
      out.write("     <br/><br/>\n");
      out.write("     <div class=\"container\">\n");
      out.write("        <h1>Add Officer!!!</h1>\n");
      out.write("        <label for=\"NameLabel\"><b>Name</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Name\" name=\"name\" onblur=\"checkExist()\">\n");
      out.write("        <span id=\"registeredNofield\" style=\"color:red\"></span>\n");
      out.write("\n");
      out.write("        <br/><label for=\"AgencyLabel\"><b>Agency Name</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Agency Name\" name=\"agencyName\"/>\n");
      out.write("         <span id=\"orgNamefield\" style=\"color:red\"></span>\n");
      out.write("         \n");
      out.write("         <br/><label for=\"DeptLabel\"><b>Department Name Name</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Department Id\" name=\"deptId\"/>\n");
      out.write("         <span id=\"orgNamefield\" style=\"color:red\"></span>\n");
      out.write("\n");
      out.write("         <br/><label for=\"contactNoLabel\"><b>Contact Number</b></label>\n");
      out.write("        <input type=\"number\" placeholder=\"Contact Number\" name=\"contactNo\"/>\n");
      out.write("         <span id=\"contactNofield\" style=\"color:red\"></span>\n");
      out.write("\n");
      out.write("         <br/><label for=\"emailLabel\"><b>Email</b></label>\n");
      out.write("        <input type=\"text\" placeholder=\"Email\" name=\"email\"/>\n");
      out.write("        <span id=\"emailfield\" style=\"color:red\"></span>\n");
      out.write("        \n");
      out.write("        <br/><label for=\"officerTypeLabel\"><b>Email</b></label>\n");
      out.write("        <select name=\"officerType\">\n");
      out.write("             <option value=\"\" disabled=disabled selected>select...</option>\n");
      out.write("             <option value=\"Investigation Officer\">Investigation Officer</option>\n");
      out.write("             <option value=\"Forensic Officer\">Forensic Officer</option>\n");
      out.write("         </select>\n");
      out.write("        <span id=\"emailfield\" style=\"color:red\"></span>\n");
      out.write("\n");
      out.write("        <br/><label for=\"locationLabel\"><b>Location</b></label>\n");
      out.write("         <select name=\"location\">\n");
      out.write("             <option value=\"\" disabled=disabled selected>select...</option>\n");
      out.write("             <option value=\"TamilNadu\">Tamil Nadu</option>\n");
      out.write("             <option value=\"Telangana\">Telangana</option> \n");
      out.write("             <option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("             <option value=\"Karnataka\">Karnataka</option>\n");
      out.write("             <option value=\"Kerala\">Kerala</option>\n");
      out.write("             <option value=\"Madhya Pradesh\">Madhya Pradesh</option>\n");
      out.write("             <option value=\"Haryana\">Haryana</option>\n");
      out.write("             <option value=\"Delhi\">Delhi</option>\n");
      out.write("             <option value=\"Gujarat\">Gujarat</option>\n");
      out.write("             <option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("     </select>\n");
      out.write("     <span id=\"locationfield\" style=\"color:red\"></span>\n");
      out.write("\n");
      out.write("     <br/><button type=\"submit\">Submit</button>\n");
      out.write("     <button type=\"reset\">Reset</button>\n");
      out.write("   </div>\n");
      out.write("</form>\n");
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
