package org.apache.jsp.Resource_005fLib;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.xavier.*;
import org.apache.commons.io.FilenameUtils;

public final class Xavier_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      org.xavier.FileList xav = null;
      synchronized (session) {
        xav = (org.xavier.FileList) _jspx_page_context.getAttribute("xav", PageContext.SESSION_SCOPE);
        if (xav == null){
          xav = new org.xavier.FileList();
          _jspx_page_context.setAttribute("xav", xav, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("xav"), request);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <style> H5 {color:#335533} \r\n");
      out.write("  body {color:#666633}</style>\r\n");
      out.write("  <body style=\"font-family:Arial;font-size:12pt;background-color:#FFFFCC\" SCROLLLING = \"YES\">\r\n");
      out.write("\r\n");
      out.write("<TABLE>\r\n");
      out.write("\r\n");
	
	CheckBoxTest cbt = new CheckBoxTest();

	for(int i = 0; i < xav.listOfFiles.size(); i++){
	//System.out.println(xav.listOfFiles.get(i));

	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t<TD width = 33%>\r\n");
      out.write("\t<div style=\"background-color:BLUE; color:YELLOW;padding:2px\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"background-color:#F5ECCE; color:Green;padding:2px\">\r\n");
      out.write("\r\n");
      out.write("\t<img src=  \r\n");
      out.write("\t\"");
      out.print(xav.listOfFiles.get(i));
      out.write("\" alt=\"");
      out.print(xav.listOfFiles.get(i));
      out.write("\" height=\"300\" width=\"420\"\r\n");
      out.write("\t>\r\n");
      out.write("\t\r\n");
      out.write("\t</img>\r\n");
      out.write("\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<FORM METHOD=POST ACTION=\"Xavier.jsp\">\r\n");
      out.write("\r\n");
      out.write("<BIG><B>School</BIG>\r\n");
      out.write("\r\n");
      out.write("<select NAME = topic>\r\n");
      out.write("\t<option value=\r\n");
      out.write("<input type=\"checkbox\" name=\"id\" value=\"Java\"> \r\n");
      out.write("   </option>\r\n");
      out.write("<option value=\r\n");
      out.write("<input type=\"checkbox\" name=\"id\" value=\"Java\"> \r\n");
      out.write("   </option>\r\n");
      out.write("</select>\r\n");
      out.write("\r\n");
      out.write("<INPUT TYPE=SUBMIT value = \"Submit\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("<form action=\"Xavier.jsp\" method=\"POST\">\r\n");
      out.write("\tNew Tag: <input type=\"text\" name=\"new_tag\" />\r\n");
      out.write("\t<input type=\"submit\" value=\"Add new tag\" />\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\t</TD>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t");

	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</TABLE>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
