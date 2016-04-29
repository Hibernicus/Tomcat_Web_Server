package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class example_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>My Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 java.util.Date d = new java.util.Date(); 
      out.write("\r\n");
      out.write("<h1>\r\n");
      out.write("Today's date is ");
      out.print( d.toString() );
      out.write(" and this jsp page worked!\r\n");
      out.write("</h1>\r\n");
      out.write("<br>\r\n");
      out.write("<TABLE Border = 2>\r\n");

String[] list = new String[]{
	"Price", "Year", "Colour", "Mileage", "Location"
};

String[] nums = new String[]{
		"£5,000", "2007", "Red", "60,000", "Durham"
};

String[] ps = new String[]{
		"moo", "blah", "foo", "kung", "figs"
};

    for ( int i = 0; i < 5; i++ ) {
        
      out.write("\r\n");
      out.write("        <TR>\r\n");
      out.write("        <TD>");
      out.print(list[i]);
      out.write("</TD>\r\n");
      out.write("        <TD>");
      out.print(nums[i]);
      out.write("</TD>\r\n");
      out.write("\t<TD>");
      out.print(ps[i]);
      out.write("</TD>\r\n");
      out.write("\t<TD><INPUT TYPE=TEXT NAME=username SIZE=20></TD>\r\n");
      out.write("\t<TD><INPUT TYPE=SUBMIT name = \"Submit ");
      out.print(i+1);
      out.write("\" value = \"Submit ");
      out.print(i+1);
      out.write("\"></TD>\r\n");
      out.write("        </TR>\r\n");
      out.write("        ");

    }

      out.write("\r\n");
      out.write("</TABLE>\r\n");
      out.write("<br>\r\n");
      out.write("<a href = \"http://www.yahoo.co.uk\" target = \"blank\">www.yahoo.co.uk</a>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write(" <img src = \"image2.png\"/><br>\r\n");
      out.write("<a href = \"Test.jnlp\"> <img src = \"info.png\"/></a>\r\n");
      out.write("<p>\r\n");
      out.write("\r\n");
      out.write("<a href = \"hello-world\">HelloWorld Servlet</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<FORM METHOD=POST ACTION=\"SaveName.jsp\">\r\n");
      out.write("What's your name? <INPUT TYPE=TEXT NAME=username SIZE=20>\r\n");
      out.write("<P><INPUT TYPE=SUBMIT>\r\n");
      out.write("</FORM>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<a href = \"second-servlet\">Second Servlet</a>\r\n");
      out.write("<br>\r\n");
      out.write("<br><a href = \"J:\\Foundation Studies & Learner Support\\old course files\\SFL CG 3792 11-12 - Current File\\Resources\\100 Metres Dash Game Instructions.docx\">open</a>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
