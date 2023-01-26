package org.jsp.BasicWeb_proj1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Firstservlet extends  GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse reqs) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		
		PrintWriter out = reqs.getWriter();
		out.println("<html><body bgcolor = 'red'>"
				+"<h1>name is "+name+"and place is"+place+"</h1>"
				+"</body><.html>");
		out.close();
	}

	
}
