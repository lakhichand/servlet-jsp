package org.jsp.LifeCycle_proj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{
	
	public FirstServlet() {
		System.out.println("Servlet object s created");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("servlet object is intialised");
	}

	public void service(ServletRequest req, ServletResponse reqs) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		
		PrintWriter out = reqs.getWriter();
		out.println("<html><body bgcolor = 'red'>"
				+"<h1>name is " +name+ "and place is " +place+ "</h1>"
				+"</body><.html>");
		out.close();
		System.out.println("Serivce method is executed");
	}
	 @Override
	public void destroy() {
		System.out.println("Close all the costly resourses");
	}

}
