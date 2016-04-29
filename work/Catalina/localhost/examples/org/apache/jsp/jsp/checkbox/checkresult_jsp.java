package org.apache.jsp.jsp.checkbox;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkresult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String[] fruits; 
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

      out.write("<html>\n");
      out.write("<!--\n");
      out.write(" Licensed to the Apache Software Foundation (ASF) under one or more\n");
      out.write("  contributor license agreements.  See the NOTICE file distributed with\n");
      out.write("  this work for additional information regarding copyright ownership.\n");
      out.write("  The ASF licenses this file to You under the Apache License, Version 2.0\n");
      out.write("  (the \"License\"); you may not use this file except in compliance with\n");
      out.write("  the License.  You may obtain a copy of the License at\n");
      out.write("\n");
      out.write("      http://www.apache.org/licenses/LICENSE-2.0\n");
      out.write("\n");
      out.write("  Unless required by applicable law or agreed to in writing, software\n");
      out.write("  distributed under the License is distributed on an \"AS IS\" BASIS,\n");
      out.write("  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n");
      out.write("  See the License for the specific language governing permissions and\n");
      out.write("  limitations under the License.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<body bgcolor=\"white\">\n");
      out.write("<font size=5 color=\"red\">\n");
      out.write('\n');
      checkbox.CheckTest foo = null;
      synchronized (_jspx_page_context) {
        foo = (checkbox.CheckTest) _jspx_page_context.getAttribute("foo", PageContext.PAGE_SCOPE);
        if (foo == null){
          foo = new checkbox.CheckTest();
          _jspx_page_context.setAttribute("foo", foo, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("foo"), "fruit", request.getParameter("fruit"), request, "fruit", false);
      out.write("\n");
      out.write("<hr>\n");
      out.write("The checked fruits (got using request) are: <br>\n");
 
	fruits = request.getParameterValues("fruit");

      out.write("\n");
      out.write("<ul>\n");

    if (fruits != null) {
	  for (int i = 0; i < fruits.length; i++) {

      out.write("\n");
      out.write("<li>\n");

	      out.println (util.HTMLFilter.filter(fruits[i]));
	  }
	} else out.println ("none selected");

      out.write("\n");
      out.write("</ul>\n");
      out.write("<br>\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("The checked fruits (got using beans) are <br>\n");
      out.write("\n");
 
		fruits = foo.getFruit();

      out.write("\n");
      out.write("<ul>\n");

    if (!fruits[0].equals("1")) {
	  for (int i = 0; i < fruits.length; i++) {

      out.write("\n");
      out.write("<li>\n");

		  out.println (util.HTMLFilter.filter(fruits[i]));
	  }
	} else out.println ("none selected");

      out.write("\n");
      out.write("</ul>\n");
      out.write("</font>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
