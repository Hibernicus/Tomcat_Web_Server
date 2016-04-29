<jsp:useBean id="xav" class="org.xavier.FileList" scope="session"/>
<jsp:setProperty name="xav" property="*" />
<%@page import ="org.xavier.*"%>
<%@page import ="org.apache.commons.io.FilenameUtils"%>
<html>
 <style> H5 {color:#335533} 
  body {color:#666633}</style>
  <body style="font-family:Arial;font-size:12pt;background-color:#FFFFCC" SCROLLLING = "YES">

<TABLE>

<%	
	CheckBoxTest cbt = new CheckBoxTest();

	for(int i = 0; i < xav.listOfFiles.size(); i++){
	//System.out.println(xav.listOfFiles.get(i));

	%>
	
	<TR>
	<TD width = 33%>
	<div style="background-color:BLUE; color:YELLOW;padding:2px">
	</div>
	<div style="background-color:#F5ECCE; color:Green;padding:2px">

	<img src=  
	"<%=xav.listOfFiles.get(i)%>" alt="<%=xav.listOfFiles.get(i)%>" height="300" width="420"
	>
	
	</img>
	<br>



<FORM METHOD=POST ACTION="Xavier.jsp">

<BIG><B>School</BIG>

<select NAME = topic>
	<option value=
<input type="checkbox" name="id" value="Java"> 
   </option>
<option value=
<input type="checkbox" name="id" value="Java"> 
   </option>
</select>

<INPUT TYPE=SUBMIT value = "Submit">


</FORM>
<form action="Xavier.jsp" method="POST">
	New Tag: <input type="text" name="new_tag" />
	<input type="submit" value="Add new tag" />
</form>

	</TD>
	</div>
	</TR>
	<%
	}
	%>


</TABLE>
</body>

</html>
