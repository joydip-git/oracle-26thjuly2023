package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
/*import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;*/
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello", name = "HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloWorldServlet() {
		System.out.println("servlet instance created");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("<h2>response from servlet</h2>");
	}
}
/*
 * public class HelloWorldServlet implements Servlet {
 * 
 * @Override public void destroy() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public ServletConfig getServletConfig() { // TODO Auto-generated
 * method stub return null; }
 * 
 * @Override public String getServletInfo() { // TODO Auto-generated method stub
 * return null; }
 * 
 * @Override public void init(ServletConfig arg0) throws ServletException { //
 * TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void service(ServletRequest arg0, ServletResponse arg1)
 * throws ServletException, IOException {
 * arg1.getWriter().println("<h2>response from servlet</h2>"); } }
 */
