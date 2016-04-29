<jsp:useBean id="finder" class="org.resources.ResourceFinder" scope="session"/>
<jsp:setProperty name="finder" property="*" />
<%@page import ="org.resources.*"%>

<html>
 <style> H5 {color:#335533} 
  body {color:#666633}</style>
  <body style="font-family:Arial;font-size:12pt;background-color:#FFFFCC" SCROLLLING = "YES">



<TABLE>
<TR>
<TD width = 25%>
<div style="background-color:BLUE; color:YELLOW;padding:2px">
<H1>Maths Resources</H1>
</div>
<div style="background-color:#F5ECCE; color:Green;padding:2px">
<FORM METHOD=POST ACTION="Maths_Resources.jsp">

<BIG><B>Level</BIG>
<select NAME = level>
   <option value="all">all</option>
   <option value="pre-Entry">pre-Entry</option>
   <option value="E1">E1</option>
   <option value="E2">E2</option>
   <option value="E3">E3</option>
   <option value="l1">l1</option>
   <option value="l2">l2</option>
</select>
<br><br>
<%TopicList mList = new TopicList("maths", "topic");%>
	Topic</BIG>
	<select NAME = topic>
	<option value="all">all</option>
	<%for(int t = 0; t <mList.topics.size(); t++){%>
		<option value= "<%= mList.topics.get(t)%>"><%= mList.topics.get(t)%></option>
	<%}%>
	</select>

<br><br>
<%TopicList mTagList = new TopicList("maths", "tag");%>
	Tag</B></BIG>
	<select NAME = tag>
	<option value="all">all</option>
	<%for(int t = 0; t <mTagList.topics.size(); t++){%>
		<option value= "<%= mTagList.topics.get(t)%>"><%= mTagList.topics.get(t)%></option>
	<%}%>
	</select>

<br><br>
<INPUT TYPE=SUBMIT value = "Search">


</FORM>
</div>
</TD>
<TD width = 25%>
<div style="background-color:GREEN; color:YELLOW;padding:2px">
<H1>English Resources</H1>
</div>
<div style="background-color:#F5ECCE; color:Green;padding:2px">
<FORM METHOD=POST ACTION="English_Resources.jsp" >

<BIG><B>Level</BIG>
<select NAME = level>
   <option value="all">all</option>
   <option value="pre-Entry">pre-Entry</option>
   <option value="E1">E1</option>
   <option value="E2">E2</option>
   <option value="E3">E3</option>
   <option value="l1">l1</option>
   <option value="l2">l2</option>
</select>
<br><br>
<%TopicList eList = new TopicList("english", "topic");%>
	Topic</BIG>
	<select NAME = topic>
	<option value="all">all</option>
	<%for(int t = 0; t <eList.topics.size(); t++){%>
		<option value= "<%= eList.topics.get(t)%>"><%= eList.topics.get(t)%></option>
	<%}%>
	</select>

<br><br>
<%TopicList eTagList = new TopicList("english", "tag");%>
	Tag</B></BIG>
	<select NAME = tag>
	<option value="all">all</option>
	<%for(int t = 0; t <eTagList.topics.size(); t++){%>
		<option value= "<%= eTagList.topics.get(t)%>"><%= eTagList.topics.get(t)%></option>
	<%}%>
	</select>

<br><br>
<INPUT TYPE=SUBMIT value = "Search">

</FORM>
</div>
</TD>
<TD width = 25%>
<div style="background-color:PURPLE; color:YELLOW;padding:2px">
<H1>ICT Resources</H1>
</div>
<div style="background-color:#F5ECCE; color:Green;padding:2px">
<FORM METHOD=POST ACTION="ICT_Resources.jsp" >

<BIG><B>Level</BIG>
<select NAME = level>
   <option value="all">all</option>
   <option value="pre-Entry">pre-Entry</option>
   <option value="E1">E1</option>
   <option value="E2">E2</option>
   <option value="E3">E3</option>
   <option value="l1">l1</option>
   <option value="l2">l2</option>
</select>
<br><br>
<%TopicList iList = new TopicList("ICT", "topic");%>
	Topic </BIG>
	<select NAME = topic>
	<option value="all">all</option>
	<%for(int t = 0; t <iList.topics.size(); t++){%>
		<option value= "<%= iList.topics.get(t)%>"><%= iList.topics.get(t)%></option>
	<%};%>
	</select>

<br><br>
<%TopicList iTagList = new TopicList("ICT", "tag");%>
	Tag</B></BIG>
	<select NAME = tag>
	<option value="all">all</option>
	<%for(int t = 0; t <iTagList.topics.size(); t++){%>
		<option value= "<%= iTagList.topics.get(t)%>"><%= iTagList.topics.get(t)%></option>
	<%}%>
	</select>

<br><br>

<INPUT TYPE=SUBMIT value = "Search">
</FORM>
</div>
</TD>
<TD width = 25%>
<div style="background-color:Orange; color:YELLOW;padding:2px">
<H1>User Defined</H1>
</div>
<div style="background-color:#F5ECCE; color:Green;padding:2px">
<FORM METHOD=POST ACTION="User.jsp" >

<BIG><B>Level</BIG>

<select NAME = level>
   <option value="all">all</option>
   <option value="pre-Entry">pre-Entry</option>
   <option value="E1">E1</option>
   <option value="E2">E2</option>
   <option value="E3">E3</option>
   <option value="l1">l1</option>
   <option value="l2">l2</option>
</select>
<br><br>

<%TopicList uTagList = new TopicList("User_Defined", "user_def");%>
	Tag
	<select NAME = tag>
	<option value="all">all</option>
	<%for(int t = 0; t <uTagList.topics.size(); t++){%>
		<option value= "<%= uTagList.topics.get(t)%>"><%= uTagList.topics.get(t)%></option>
	<%}%>
	</select>
<br><br>
	<BIG>:</BIG></B>

<br><br>

<INPUT TYPE=SUBMIT value = "Search">
</FORM>
</div>
</TD>
</TR>
</TABLE>
<div>
 

<% 

String lev = finder.getLevel();
String top = finder.getTopic();
String tag = finder.getTag();

MyXMLReader xReader = new MyXMLReader();
	xReader.elemList("all", "iLevel", lev, "e_topic", "all", "u_tag", tag);
	
		xReader.elemList("all", "eLevel", lev, "e_topic", "all", "u_tag", tag);
	
	
		xReader.elemList("all", "mLevel", lev, "e_topic", "all", "u_tag", tag);
	

for(int i = 0; i < xReader.vars.size(); i++){
	%>
<TABLE border = "2" width = 100% >

<TR>
<TD>
<div>
	 <span style="font-weight:bold">

<pre>Maths Resource Number: <%= i+1%>	Resource Name:	<%=xReader.vars.get(i).getResName()%>	Resource Type:	<%=xReader.vars.get(i).getResExt()%>	<a href = "<%=xReader.vars.get(i).getResPath()%>" >Open Resource</a> </pre>
	 
	</span>
</div>
<div style="font-weight:bold">
 <pre>Description:
	<%= xReader.vars.get(i).getDescription()%></pre>
</div>

 <Table>
	<TR>
	<TD width = 33%>
		<b>Subjects:</b>
		<%try{xReader.vars.get(i).subjects.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).subjects.size() != 0){
			for(int sj = 0; sj < xReader.vars.get(i).subjects.size(); sj++){
			   %><br><%= xReader.vars.get(i).subjects.get(sj)%><%
			}
		  }
		
		%>
		<br><br><b>English Levels:</b>
		<%try{xReader.vars.get(i).english_levels.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).english_levels.size() != 0){
			for(int el = 0; el < xReader.vars.get(i).english_levels.size(); el++){
			   %><br><%= xReader.vars.get(i).english_levels.get(el)%><%
			}
		  }
		
		%>
		<br><br><b>Maths Levels:</b>
		<%try{xReader.vars.get(i).maths_levels.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).maths_levels.size() != 0){
			for(int ml = 0; ml < xReader.vars.get(i).maths_levels.size(); ml++){
			   %><br><%= xReader.vars.get(i).maths_levels.get(ml)%><%
			}
		  }
		
		%>
		<br><br><b>ICT Levels:</b>
		<%try{xReader.vars.get(i).ict_levels.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).ict_levels.size() != 0){
			for(int il = 0; il < xReader.vars.get(i).ict_levels.size(); il++){
			   %><br><%= xReader.vars.get(i).ict_levels.get(il)%><%
			}
		  }
		
		%>
		<br><br><b>English Topics:</b>
		<%try{xReader.vars.get(i).english_topics.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).english_topics.size() != 0){
			for(int et = 0; et < xReader.vars.get(i).english_topics.size(); et++){
			   %><br><%= xReader.vars.get(i).english_topics.get(et)%><%
			}
		  }
		
		%>
		<br><br><b>Maths Topics:</b>
		<%try{xReader.vars.get(i).maths_topics.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).maths_topics.size() != 0){
			for(int mt = 0; mt < xReader.vars.get(i).maths_topics.size(); mt++){
			   %><br><%= xReader.vars.get(i).maths_topics.get(mt)%><%
			}
		  }
		
		%>
		<br><br><b>ICT Topics:</b>
		<%try{xReader.vars.get(i).ict_topics.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).ict_topics.size() != 0){
			for(int it = 0; it < xReader.vars.get(i).ict_topics.size(); it++){
			   %><br><%= xReader.vars.get(i).ict_topics.get(it)%><%
			}
		  }
		
		%>
		
	    </TD>
	   <TD width = 33%>
		<b>English Tags:</b>
		<%try{xReader.vars.get(i).english_tags.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).english_tags.size() != 0){
			for(int et = 0; et < xReader.vars.get(i).english_tags.size(); et++){
			   %><br><%= xReader.vars.get(i).english_tags.get(et)%><%
			}
		  }
		
		%>
		<br><br><b>Maths Tags:</b>
		<% try{xReader.vars.get(i).maths_tags.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).maths_tags.size() != 0){
			for(int mt = 0; mt < xReader.vars.get(i).maths_tags.size(); mt++){
			   %><br><%= xReader.vars.get(i).maths_tags.get(mt)%><%
			}
		  }
		
		%>
		<br><br><b>ICT Tags:</b>
		<% try{xReader.vars.get(i).ict_tags.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).ict_tags.size() != 0){
			for(int it = 0; it < xReader.vars.get(i).ict_tags.size(); it++){
			   %><br><%= xReader.vars.get(i).ict_tags.get(it)%><%
			}
		  }
		
		%>

		<br><br><b>SEAL:</b>
		<%
		
		   if(xReader.vars.get(i).seal.size() != 0){
			for(int sl = 0; sl < xReader.vars.get(i).seal.size(); sl++){
			   %><br><%= xReader.vars.get(i).seal.get(sl)%><%
			}
		  }
		
		%>
		<br><br><b>SMSC:</b>
		<%
		
		   if(xReader.vars.get(i).smsc.size() != 0){
			for(int sm = 0; sm < xReader.vars.get(i).smsc.size(); sm++){
			   %><br><%= xReader.vars.get(i).smsc.get(sm)%><%
			}
		  }
		
		%>
		<br><br><b>ECM:</b>
		<%
		
		   if(xReader.vars.get(i).ecm.size() != 0){
			for(int et = 0; et < xReader.vars.get(i).ecm.size(); et++){
			   %><br><%= xReader.vars.get(i).ecm.get(et)%><%
			}
		  }
		
		%>
		<br><br><b>REGARDS:</b>
		<%
		
		   if(xReader.vars.get(i).regards.size() != 0){
			for(int mt = 0; mt < xReader.vars.get(i).regards.size(); mt++){
			   %><br><%= xReader.vars.get(i).regards.get(mt)%><%
			}
		  }
		
		%>
		<br><br><b>Other:</b>
		<% try{xReader.vars.get(i).user_tags.remove("All");}
			catch(Exception s){}
		
		   if(xReader.vars.get(i).user_tags.size() != 0){
			for(int it = 0; it < xReader.vars.get(i).user_tags.size(); it++){
			   %><br><%= xReader.vars.get(i).user_tags.get(it)%><%
			}
		  }
		
		%>
           </TD>
	   <TD width = 33%>
		<b>Core Curriculum:</b>
		<%if(xReader.vars.get(i).core_codes.size() != 0){
			for(int cc = 0; cc < xReader.vars.get(i).core_codes.size(); cc++){
			   %><br><%= xReader.vars.get(i).core_codes.get(cc)%><%
			}
		}%>

		<br><br><b>Functional Skills:</b>
		<%if(xReader.vars.get(i).fs_codes.size() != 0){
			for(int fs = 0; fs < xReader.vars.get(i).fs_codes.size(); fs++){
			   %><br><%= xReader.vars.get(i).fs_codes.get(fs)%><%
			}
		}%>
		
           </TD>
	</TR>
</TABLE>
</TD>
</TR>

</TABLE>

<%

	}
%>

</div>

</div>
</BODY>

</HTML>
