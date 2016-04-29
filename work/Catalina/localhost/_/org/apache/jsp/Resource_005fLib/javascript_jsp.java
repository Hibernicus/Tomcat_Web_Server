package org.apache.jsp.Resource_005fLib;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class javascript_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script>\r\n");
      out.write("function validLogin() // java script function is created\r\n");
      out.write("{\r\n");
      out.write("if(document.frm1.userName.value == \"\")\r\n");
      out.write("{\r\n");
      out.write("alert ( \"Please enter mrbool Login Name.\" ); //java script message will be display\r\n");
      out.write("document.loginform.userName.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("if (document.frm1.pass.value == \"\")\r\n");
      out.write("{\r\n");
      out.write("alert ( \"Please Enter your secret password..\" );\r\n");
      out.write("document.userform.password.focus();\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("alert(\"Welcome mrbool readers\" );\r\n");
      out.write("return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"frm1\" method=\"post\" onsubmit=\"return validLogin();\">\r\n");
      out.write("<table width=\"150px\" border=0 style=\"background-color: H0080FF80;\">\r\n");
      out.write("<tr><td colspan=2 align=\"center\" style=\"font-weight:bold;font-size:20pt;\" align=\"center\"><b>B.C.E.I User Login Form.</b></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr><td colspan=2> </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr><td style=\"font-size:12pt;\" align=\"center\">Enter login Name:</td>\r\n");
      out.write("<td><input type=\"text\" name=\"userName\" value=\"\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr><td style=\"font-size:12pt;\" align=\"center\">Enter Password:</td>\r\n");
      out.write("<td><input type=\"password\" name=\"password\" value=\"\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td></td>\r\n");
      out.write("<td><input type=\"submit\" name=\"Submit\" value=\"Login as B.C.E.I Users\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
