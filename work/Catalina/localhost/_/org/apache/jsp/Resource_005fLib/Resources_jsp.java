package org.apache.jsp.Resource_005fLib;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.resources.*;

public final class Resources_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("finder"), request);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <style> H5 {color:#335533} \r\n");
      out.write("  body {color:#666633}</style>\r\n");
      out.write("  <body style=\"font-family:Arial;font-size:12pt;background-color:#FFFFCC\" SCROLLLING = \"YES\">\r\n");
      out.write("\r\n");
finder.setLevel("all");
finder.setTopic("all");
finder.setTag("all");


      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD width = 25%>\r\n");
      out.write("<div style=\"background-color:BLUE; color:YELLOW;padding:2px\">\r\n");
      out.write("<H1>Maths Resources</H1>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"background-color:#F5ECCE; color:Green;padding:2px\">\r\n");
      out.write("<FORM METHOD=POST ACTION=\"Maths_Resources.jsp\">\r\n");
      out.write("\r\n");
      out.write("<BIG><B>Level</BIG>\r\n");
      out.write("<select NAME = level>\r\n");
      out.write("   <option value=\"all\">all</option>\r\n");
      out.write("   <option value=\"pre-Entry\">pre-Entry</option>\r\n");
      out.write("   <option value=\"E1\">E1</option>\r\n");
      out.write("   <option value=\"E2\">E2</option>\r\n");
      out.write("   <option value=\"E3\">E3</option>\r\n");
      out.write("   <option value=\"l1\">l1</option>\r\n");
      out.write("   <option value=\"l2\">l2</option>\r\n");
      out.write("</select>\r\n");
      out.write("<br><br>\r\n");
TopicList mList = new TopicList("maths", "topic");
      out.write("\r\n");
      out.write("\tTopic</BIG>\r\n");
      out.write("\t<select NAME = topic>\r\n");
      out.write("\t<option value=\"all\">all</option>\r\n");
      out.write("\t");
for(int t = 0; t <mList.topics.size(); t++){
      out.write("\r\n");
      out.write("\t\t<option value= \"");
      out.print( mList.topics.get(t));
      out.write('"');
      out.write('>');
      out.print( mList.topics.get(t));
      out.write("</option>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
TopicList mTagList = new TopicList("maths", "tag");
      out.write("\r\n");
      out.write("\tTag</B></BIG>\r\n");
      out.write("\t<select NAME = tag>\r\n");
      out.write("\t<option value=\"all\">all</option>\r\n");
      out.write("\t");
for(int t = 0; t <mTagList.topics.size(); t++){
      out.write("\r\n");
      out.write("\t\t<option value= \"");
      out.print( mTagList.topics.get(t));
      out.write('"');
      out.write('>');
      out.print( mTagList.topics.get(t));
      out.write("</option>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<INPUT TYPE=SUBMIT value = \"Search\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("</div>\r\n");
      out.write("</TD>\r\n");
      out.write("<TD width = 25%>\r\n");
      out.write("<div style=\"background-color:GREEN; color:YELLOW;padding:2px\">\r\n");
      out.write("<H1>English Resources</H1>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"background-color:#F5ECCE; color:Green;padding:2px\">\r\n");
      out.write("<FORM METHOD=POST ACTION=\"English_Resources.jsp\" >\r\n");
      out.write("\r\n");
      out.write("<BIG><B>Level</BIG>\r\n");
      out.write("<select NAME = level>\r\n");
      out.write("   <option value=\"all\">all</option>\r\n");
      out.write("   <option value=\"pre-Entry\">pre-Entry</option>\r\n");
      out.write("   <option value=\"E1\">E1</option>\r\n");
      out.write("   <option value=\"E2\">E2</option>\r\n");
      out.write("   <option value=\"E3\">E3</option>\r\n");
      out.write("   <option value=\"l1\">l1</option>\r\n");
      out.write("   <option value=\"l2\">l2</option>\r\n");
      out.write("</select>\r\n");
      out.write("<br><br>\r\n");
TopicList eList = new TopicList("english", "topic");
      out.write("\r\n");
      out.write("\tTopic</BIG>\r\n");
      out.write("\t<select NAME = topic>\r\n");
      out.write("\t<option value=\"all\">all</option>\r\n");
      out.write("\t");
for(int t = 0; t <eList.topics.size(); t++){
      out.write("\r\n");
      out.write("\t\t<option value= \"");
      out.print( eList.topics.get(t));
      out.write('"');
      out.write('>');
      out.print( eList.topics.get(t));
      out.write("</option>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
TopicList eTagList = new TopicList("english", "tag");
      out.write("\r\n");
      out.write("\tTag</B></BIG>\r\n");
      out.write("\t<select NAME = tag>\r\n");
      out.write("\t<option value=\"all\">all</option>\r\n");
      out.write("\t");
for(int t = 0; t <eTagList.topics.size(); t++){
      out.write("\r\n");
      out.write("\t\t<option value= \"");
      out.print( eTagList.topics.get(t));
      out.write('"');
      out.write('>');
      out.print( eTagList.topics.get(t));
      out.write("</option>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("<INPUT TYPE=SUBMIT value = \"Search\">\r\n");
      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("</div>\r\n");
      out.write("</TD>\r\n");
      out.write("<TD width = 25%>\r\n");
      out.write("<div style=\"background-color:PURPLE; color:YELLOW;padding:2px\">\r\n");
      out.write("<H1>ICT Resources</H1>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"background-color:#F5ECCE; color:Green;padding:2px\">\r\n");
      out.write("<FORM METHOD=POST ACTION=\"ICT_Resources.jsp\" >\r\n");
      out.write("\r\n");
      out.write("<BIG><B>Level</BIG>\r\n");
      out.write("<select NAME = level>\r\n");
      out.write("   <option value=\"all\">all</option>\r\n");
      out.write("   <option value=\"pre-Entry\">pre-Entry</option>\r\n");
      out.write("   <option value=\"E1\">E1</option>\r\n");
      out.write("   <option value=\"E2\">E2</option>\r\n");
      out.write("   <option value=\"E3\">E3</option>\r\n");
      out.write("   <option value=\"l1\">l1</option>\r\n");
      out.write("   <option value=\"l2\">l2</option>\r\n");
      out.write("</select>\r\n");
      out.write("<br><br>\r\n");
TopicList iList = new TopicList("ICT", "topic");
      out.write("\r\n");
      out.write("\tTopic </BIG>\r\n");
      out.write("\t<select NAME = topic>\r\n");
      out.write("\t<option value=\"all\">all</option>\r\n");
      out.write("\t");
for(int t = 0; t <iList.topics.size(); t++){
      out.write("\r\n");
      out.write("\t\t<option value= \"");
      out.print( iList.topics.get(t));
      out.write('"');
      out.write('>');
      out.print( iList.topics.get(t));
      out.write("</option>\r\n");
      out.write("\t");
};
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
TopicList iTagList = new TopicList("ICT", "tag");
      out.write("\r\n");
      out.write("\tTag</B></BIG>\r\n");
      out.write("\t<select NAME = tag>\r\n");
      out.write("\t<option value=\"all\">all</option>\r\n");
      out.write("\t");
for(int t = 0; t <iTagList.topics.size(); t++){
      out.write("\r\n");
      out.write("\t\t<option value= \"");
      out.print( iTagList.topics.get(t));
      out.write('"');
      out.write('>');
      out.print( iTagList.topics.get(t));
      out.write("</option>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<INPUT TYPE=SUBMIT value = \"Search\">\r\n");
      out.write("</FORM>\r\n");
      out.write("</div>\r\n");
      out.write("</TD>\r\n");
      out.write("<TD width = 25%>\r\n");
      out.write("<div style=\"background-color:Orange; color:YELLOW;padding:2px\">\r\n");
      out.write("<H1>User Defined</H1>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"background-color:#F5ECCE; color:Green;padding:2px\">\r\n");
      out.write("<FORM METHOD=POST ACTION=\"User.jsp\" >\r\n");
      out.write("\r\n");
      out.write("<BIG><B>Level</BIG>\r\n");
      out.write("\r\n");
      out.write("<select NAME = level>\r\n");
      out.write("   <option value=\"all\">all</option>\r\n");
      out.write("   <option value=\"pre-Entry\">pre-Entry</option>\r\n");
      out.write("   <option value=\"E1\">E1</option>\r\n");
      out.write("   <option value=\"E2\">E2</option>\r\n");
      out.write("   <option value=\"E3\">E3</option>\r\n");
      out.write("   <option value=\"l1\">l1</option>\r\n");
      out.write("   <option value=\"l2\">l2</option>\r\n");
      out.write("</select>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
TopicList uTagList = new TopicList("User_Defined", "user_def");
      out.write("\r\n");
      out.write("\tTag\r\n");
      out.write("\t<select NAME = tag>\r\n");
      out.write("\t<option value=\"all\">all</option>\r\n");
      out.write("\t");
for(int t = 0; t <uTagList.topics.size(); t++){
      out.write("\r\n");
      out.write("\t\t<option value= \"");
      out.print( uTagList.topics.get(t));
      out.write('"');
      out.write('>');
      out.print( uTagList.topics.get(t));
      out.write("</option>\r\n");
      out.write("\t");
}
      out.write("\r\n");
      out.write("\t</select>\r\n");
      out.write("<br><br>\r\n");
      out.write("\t<BIG>:</BIG></B>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("<INPUT TYPE=SUBMIT value = \"Search\">\r\n");
      out.write("</FORM>\r\n");
      out.write("</div>\r\n");
      out.write("</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<div>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
 

String lev = finder.getLevel();
String top = finder.getTopic();
String tag = finder.getTag();

MyXMLReader xReader = new MyXMLReader();
	xReader.elemList("Maths", "mLevel", lev, "m_topic", top, "m_tag", tag);
for(int i = 0; i < xReader.vars.size(); i++){
	
      out.write("\r\n");
      out.write("<TABLE border = \"2\" width = 100% >\r\n");
      out.write("\r\n");
      out.write("<TR>\r\n");
      out.write("<TD>\r\n");
      out.write("<div>\r\n");
      out.write("\t <span style=\"font-weight:bold\">\r\n");
      out.write("\r\n");
      out.write("<pre>Maths Resource Number: ");
      out.print( i+1);
      out.write("\t\r\n");
      out.write("Resource Name:\t");
      out.print(xReader.vars.get(i).getResName());
      out.write("\t\r\n");
      out.write("Resource Type:\t");
      out.print(xReader.vars.get(i).getResExt());
      out.write("\t\r\n");
      out.write("<FORM ACTION = /opener METHOD = POST>\r\n");
      out.write("<input type=\"text\" name=\"filePath\" value = \"");
      out.print(xReader.vars.get(i).getResPath());
      out.write("\"  >\r\n");
      out.write("<INPUT TYPE = SUBMIT value = \"Open Resource\" >\r\n");
      out.write("</FORM>\r\n");
      out.write("</pre>\r\n");
      out.write("\t \r\n");
      out.write("\t</span>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"font-weight:bold\">\r\n");
      out.write(" <pre>Description:\r\n");
      out.write("\t");
      out.print( xReader.vars.get(i).getDescription());
      out.write("</pre>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" <Table>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t<TD width = 33%>\r\n");
      out.write("\t\t<b>Subjects:</b>\r\n");
      out.write("\t\t");
try{xReader.vars.get(i).subjects.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).subjects.size() != 0){
			for(int sj = 0; sj < xReader.vars.get(i).subjects.size(); sj++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).subjects.get(sj));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>English Levels:</b>\r\n");
      out.write("\t\t");
try{xReader.vars.get(i).english_levels.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).english_levels.size() != 0){
			for(int el = 0; el < xReader.vars.get(i).english_levels.size(); el++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).english_levels.get(el));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>Maths Levels:</b>\r\n");
      out.write("\t\t");
try{xReader.vars.get(i).maths_levels.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).maths_levels.size() != 0){
			for(int ml = 0; ml < xReader.vars.get(i).maths_levels.size(); ml++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).maths_levels.get(ml));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>ICT Levels:</b>\r\n");
      out.write("\t\t");
try{xReader.vars.get(i).ict_levels.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).ict_levels.size() != 0){
			for(int il = 0; il < xReader.vars.get(i).ict_levels.size(); il++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).ict_levels.get(il));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>English Topics:</b>\r\n");
      out.write("\t\t");
try{xReader.vars.get(i).english_topics.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).english_topics.size() != 0){
			for(int et = 0; et < xReader.vars.get(i).english_topics.size(); et++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).english_topics.get(et));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>Maths Topics:</b>\r\n");
      out.write("\t\t");
try{xReader.vars.get(i).maths_topics.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).maths_topics.size() != 0){
			for(int mt = 0; mt < xReader.vars.get(i).maths_topics.size(); mt++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).maths_topics.get(mt));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>ICT Topics:</b>\r\n");
      out.write("\t\t");
try{xReader.vars.get(i).ict_topics.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).ict_topics.size() != 0){
			for(int it = 0; it < xReader.vars.get(i).ict_topics.size(); it++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).ict_topics.get(it));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t    </TD>\r\n");
      out.write("\t   <TD width = 33%>\r\n");
      out.write("\t\t<b>English Tags:</b>\r\n");
      out.write("\t\t");
try{xReader.vars.get(i).english_tags.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).english_tags.size() != 0){
			for(int et = 0; et < xReader.vars.get(i).english_tags.size(); et++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).english_tags.get(et));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>Maths Tags:</b>\r\n");
      out.write("\t\t");
 try{xReader.vars.get(i).maths_tags.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).maths_tags.size() != 0){
			for(int mt = 0; mt < xReader.vars.get(i).maths_tags.size(); mt++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).maths_tags.get(mt));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>ICT Tags:</b>\r\n");
      out.write("\t\t");
 try{xReader.vars.get(i).ict_tags.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).ict_tags.size() != 0){
			for(int it = 0; it < xReader.vars.get(i).ict_tags.size(); it++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).ict_tags.get(it));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<br><br><b>SEAL:</b>\r\n");
      out.write("\t\t");

		
		   if(xReader.vars.get(i).seal.size() != 0){
			for(int sl = 0; sl < xReader.vars.get(i).seal.size(); sl++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).seal.get(sl));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>SMSC:</b>\r\n");
      out.write("\t\t");

		
		   if(xReader.vars.get(i).smsc.size() != 0){
			for(int sm = 0; sm < xReader.vars.get(i).smsc.size(); sm++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).smsc.get(sm));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>ECM:</b>\r\n");
      out.write("\t\t");

		
		   if(xReader.vars.get(i).ecm.size() != 0){
			for(int et = 0; et < xReader.vars.get(i).ecm.size(); et++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).ecm.get(et));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>REGARDS:</b>\r\n");
      out.write("\t\t");

		
		   if(xReader.vars.get(i).regards.size() != 0){
			for(int mt = 0; mt < xReader.vars.get(i).regards.size(); mt++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).regards.get(mt));

			}
		  }
		
		
      out.write("\r\n");
      out.write("\t\t<br><br><b>Other:</b>\r\n");
      out.write("\t\t");
 try{xReader.vars.get(i).user_tags.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).user_tags.size() != 0){
			for(int it = 0; it < xReader.vars.get(i).user_tags.size(); it++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).user_tags.get(it));

			}
		  }
		
		
      out.write("\r\n");
      out.write("           </TD>\r\n");
      out.write("\t   <TD width = 33%>\r\n");
      out.write("\t\t<b>Core Curriculum:</b>\r\n");
      out.write("\t\t");
if(xReader.vars.get(i).core_codes.size() != 0){
			for(int cc = 0; cc < xReader.vars.get(i).core_codes.size(); cc++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).core_codes.get(cc));

			}
		}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<br><br><b>Functional Skills:</b>\r\n");
      out.write("\t\t");
if(xReader.vars.get(i).fs_codes.size() != 0){
			for(int fs = 0; fs < xReader.vars.get(i).fs_codes.size(); fs++){
			   
      out.write("<br>");
      out.print( xReader.vars.get(i).fs_codes.get(fs));

			}
		}
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("           </TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");


	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("</div>\r\n");
      out.write("</BODY>\r\n");
      out.write("\r\n");
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
