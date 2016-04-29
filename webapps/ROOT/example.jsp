
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Title</title>
</head>
<body>
<% java.util.Date d = new java.util.Date(); %>
<h1>
Today's date is <%= d.toString() %> and this jsp page worked!
</h1>
<br>
<TABLE Border = 2>
<%
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
        %>
        <TR>
        <TD><%=list[i]%></TD>
        <TD><%=nums[i]%></TD>
	<TD><%=ps[i]%></TD>
	<TD><INPUT TYPE=TEXT NAME=username SIZE=20></TD>
	<TD><INPUT TYPE=SUBMIT name = "Submit <%=i+1%>" value = "Submit <%=i+1%>"></TD>
        </TR>
        <%
    }
%>
</TABLE>
<br>
<a href = "http://www.yahoo.co.uk" target = "blank">www.yahoo.co.uk</a>
<br>

 <img src = "image2.png"/><br>
<a href = "Test.jnlp"> <img src = "info.png"/></a>
<p>

<a href = "hello-world">HelloWorld Servlet</a>


<br>
<FORM METHOD=POST ACTION="SaveName.jsp">
What's your name? <INPUT TYPE=TEXT NAME=username SIZE=20>
<P><INPUT TYPE=SUBMIT>
</FORM>

<br>
<a href = "second-servlet">Second Servlet</a>
<br>
<br><a href = "J:\Foundation Studies & Learner Support\old course files\SFL CG 3792 11-12 - Current File\Resources\100 Metres Dash Game Instructions.docx">open</a>

<br>


</body>
</html>
