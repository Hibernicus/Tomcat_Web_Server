package org.john.servlets.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {

    public void init() throws ServletException 
    {
        ///// Can make here database connection
        ///// This init method once for a servlet
    }
    
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
	//String s = "servlet/HelloWorld";
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println(" <HEAD><TITLE>A Second Servlet</TITLE></HEAD>");
        out.println(" <BODY>");
        out.print(" This is ");
        out.print("example");
        out.println(", using the POST method");
	out.println("<a href = hello-world> Hello</a>");
        out.println(" </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }
    
    public void doGet(HttpServletRequest request,HttpServletResponse response) 
     throws IOException,ServletException {
        doPost(request, response);
    }
    
    public void destroy() {
            ////// Close all database connnection here
            ///// Called when servlet closing
    }

}
