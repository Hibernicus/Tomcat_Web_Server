package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GetName_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      user.UserData user = null;
      synchronized (session) {
        user = (user.UserData) _jspx_page_context.getAttribute("user", PageContext.SESSION_SCOPE);
        if (user == null){
          user = new user.UserData();
          _jspx_page_context.setAttribute("user", user, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("user"), request);
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<BODY>\r\n");
      out.write("<FORM METHOD=POST ACTION=\"XMLReader.jsp\" >\r\n");
      out.write("Level \r\n");
      out.write("<select NAME = username>\r\n");
      out.write("   <option value=\"All\">All</option>\r\n");
      out.write("   <option value=\"pre-Entry\">pre-Entry</option>\r\n");
      out.write("   <option value=\"E1\">E1</option>\r\n");
      out.write("   <option value=\"E2\">E2</option>\r\n");
      out.write("   <option value=\"E3\">E3</option>\r\n");
      out.write("   <option value=\"l1\">l1</option>\r\n");
      out.write("   <option value=\"l2\">l2</option>\r\n");
      out.write("</select>\r\n");
      out.write("<P><INPUT TYPE=SUBMIT>\r\n");
      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
