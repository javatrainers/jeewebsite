package com.servlet;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;
// @ = annotation
@WebServlet("/login")
// HttpServlet and GenericServlet - doGet, doPost, init, service
// override doGet and doPost
public class LoginServlet extends HttpServlet {

	// CONTROLLER AND MODEL
	
	// user=john123 pwd=john123!
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String uid = req.getParameter("user");
		String pwd = req.getParameter("pwd");
		if(uid.equals("john123") && pwd.equals("john123!"))
		{	/*
			
			req.setAttribute("name", "john");
			req.setAttribute("loggedin", true);
			req.setAttribute("visit", 1);
			req.getRequestDispatcher("success.html").forward(req, res);
			// forwarded program will use below method to read all information
			req.getAttribute("name" );
			req.getAttribute("loggedin" );
			req.getAttribute("visit" );
			*/
			//res.getWriter().write(" welcome to our website");
			byte[] responseBinary="welcome".getBytes();
			System.out.print(responseBinary);
			
			req.getSession().setAttribute("login",true);
			boolean x=(boolean)req.getSession().getAttribute("login");
			res.getOutputStream().write(  responseBinary );
		}else
			res.sendRedirect("https://www.google.com");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		String uid = req.getParameter("user");
		String pwd = req.getParameter("pwd");
		if(uid.equals("john123") && pwd.equals("john123!"))
			// forward if next web page.. is in the same project/website
			req.getRequestDispatcher("success.html").forward(req, res);
		else
			// redriect if next web page.. is in outside this project/website
			res.sendRedirect("https://www.google.com");
	}
	/*
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		 
		HttpSession sess=req.getSession();
		if(sess.getAttribute("loginAttempt")== null)
			sess.setAttribute("loginAttempt",0);
		if(sess.getAttribute("loginSuccess")== null)
			sess.setAttribute("loginSuccess",false);
		
		int count=(int)sess.getAttribute("loginAttempt");
		count++;
		sess.setAttribute("loginAttempt",count);
		
		String uid = req.getParameter("userid");
		String pwd = req.getParameter("password");
		System.out.println("login attempts:"+sess.getAttribute("loginAttempt"));
		if(uid.equals("john") && pwd.equals("jee"))
		{
			sess.setAttribute("loginSuccess",true);
			req.setAttribute("name", "mike");
			req.setAttribute("acct", "123");
			req.setAttribute("phone", "345");
			req.setAttribute("problem", "10$ extra in bill");
			req.getRequestDispatcher("success.html").forward(req, res);
		}	
		else
		{
			if((int)sess.getAttribute("loginAttempt") == 3)
			{
				res.getWriter().write("Login attempt exceeded. account is locked");
				return;
			}
			sess.setAttribute("loginSuccess",false);
			res.sendRedirect("http://www.google.com");
		}
			
	}
					// userid=java&password=jee
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		if(req.getSession().getAttribute("loginAttempt")== null)
			req.getSession().setAttribute("loginAttempt",0);
		
		int count=(int)req.getSession().getAttribute("loginAttempt");
		count++;
		req.getSession().setAttribute("loginAttempt",count);
		
		
		System.out.println("customer logged in :"+req.getSession().getAttribute("loginAttempt"));
		System.out.println("I am inside doget method");
		String uid = req.getParameter("userid");
		String pwd = req.getParameter("password");
		if(uid.equals("john") && pwd.equals("jee"))
			req.getRequestDispatcher("success.html").forward(req, res);
			
		else
			res.sendRedirect("http://www.google.com");
			
	

	}
*/
}
