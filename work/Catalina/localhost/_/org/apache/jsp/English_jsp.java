package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.resources.*;

public final class English_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      org.resources.ResourceFinder finder = null;
      synchronized (session) {
        finder = (org.resources.ResourceFinder) _jspx_page_context.getAttribute("finder", PageContext.SESSION_SCOPE);
        if (finder == null){
          finder = new org.resources.ResourceFinder();
          _jspx_page_context.setAttribute("finder", finder, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>English Resource Finder</H1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<BR>\r\n");
      out.write("<FORM METHOD=POST ACTION=\"English_Resources.jsp\" >\r\n");
      out.write("\r\n");
      out.write("Level \r\n");
      out.write("<select NAME = level>\r\n");
      out.write("   <option value=\"All\">All</option>\r\n");
      out.write("   <option value=\"pre-Entry\">pre-Entry</option>\r\n");
      out.write("   <option value=\"E1\">E1</option>\r\n");
      out.write("   <option value=\"E2\">E2</option>\r\n");
      out.write("   <option value=\"E3\">E3</option>\r\n");
      out.write("   <option value=\"l1\">l1</option>\r\n");
      out.write("   <option value=\"l2\">l2</option>\r\n");
      out.write("</select>\r\n");
      out.write("\r\n");
TopicList tList = new TopicList("english");
      out.write("\r\n");
      out.write("\t<select NAME = topic>\r\n");
      out.write("\t");
for(int t = 0; t <tList.topics.size(); t++){
      out.write("\r\n");
      out.write("\t\t<option value= \"");
      out.print( tList.topics.get(t));
      out.write('"');
      out.write('>');
      out.print( tList.topics.get(t));
      out.write("</option>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("\r\n");
      out.write("<INPUT TYPE=SUBMIT value = \"Search\">\r\n");
      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("<BR>\r\n");
      out.write("<h2><a href=\"Maths.jsp\" title=\"Search Maths resources\">Maths</a></h2>\r\n");
      out.write("\r\n");
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
