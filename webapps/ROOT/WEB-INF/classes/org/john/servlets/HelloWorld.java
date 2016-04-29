package org.john.servlets;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import java.io.IOException;

public class HelloWorld extends HttpServlet {
  public void doGet(HttpServletRequest request,
                      
	HttpServletResponse response)
		    
	throws ServletException, IOException{

	
		response.setContentType("text/html");
	
		PrintWriter out = response.getWriter();

	
		out.println("<html>");
	
		out.println("  <head>");
	
		out.println("    <title>Hello World</title>");
	
	out.println("  </head>");
	
	out.println("  <body>");
	
	out.println("    Boo!");

	
	out.println("   <p>");

	
	out.println("    <a href = example.jsp>click<\a>");

		out.println("  </body>");

		out.println("</html>");
    
  }
}
