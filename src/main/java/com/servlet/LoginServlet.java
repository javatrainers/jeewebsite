package com.servlet;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.DatabaseConnection;
import com.db.UsersTable;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
	
			
		HttpSession session=req.getSession();
		String uid = req.getParameter("userid");
		String pwd = req.getParameter("password");
		ArrayList<String> fav=new ArrayList<String> (); 
		if(uid.equals("john") && pwd.equals("john1!"))
		{
			fav.add("From : sony@a.com subject ; hi"); 
			fav.add("From : tony@a.com subject ; are u coming to trip ?"); 
			fav.add("From : mon@a.com subject ; bye "); 
			req.setAttribute("firstName", "johnathan");
			req.setAttribute("lastName", "doe");
			req.setAttribute("favor",fav);
			req.getRequestDispatcher("success.jsp").forward(req, res);
		}
		else if (uid.equals("jane") && pwd.equals("jane1!"))
		{
			fav.add("From : ron@a.com subject ; hello"); 
			fav.add("From : mike@a.com subject ; are u coming to office ?"); 
			fav.add("From : andy@a.com subject ; see ya");req.setAttribute("firstName", "janice");
			req.setAttribute("lastName", "joe");
			req.setAttribute("favor",fav);
			req.getRequestDispatcher("success.jsp").forward(req, res);
			
		}
		else
			res.sendRedirect("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2F&hl=en&dsh=S1023505524%3A1657318410036841&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		
		/*
		if(uid.equals("java") && pwd.equals("jee"))
		{
			// sending text response back to customer
			res.getWriter().write("success login");
			res.getWriter().flush();
			res.getWriter().close();
		}
		else {
			byte[] binaryData="failed".getBytes();
			// sending binary response back to customer
			res.getOutputStream().write(binaryData);
			res.getOutputStream().flush();
			res.getOutputStream().close();
		}
		*/
		
		
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		doPost(req,res);
	}
	
	/*
	 String uid = req.getParameter("user");
		String pwd = req.getParameter("pass");
		try {
			Connection conn=DatabaseConnection .getDBConnection();
			// method call = pass by value
			boolean result=UsersTable.validateLogin(uid, pwd, conn);
			// "boolean result=" handling the response from method call
			if(result==true)
			{
				req.setAttribute("userid", "user");
				req.setAttribute("address", "ny");
				// forward if next web page.. is in the same project/website
				req.getRequestDispatcher("success").forward(req, res);
			}
			else
				// text response
				res.sendRedirect("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	 */
	
	/*
	 try {
			Connection conn=DatabaseConnection .getDBConnection();
			boolean result=UsersTable.validateLogin(uid, pwd, conn);
			if(uid.equals("john123") && pwd.equals("john123!"))
			{
				// binary = bytes
				byte [] binaryRes="Login success".getBytes();
				res.getOutputStream().write(  binaryRes );
			}
			else
				// text response
				res.getWriter().write("Login failed");
		}catch(Exception e) {
			e.printStackTrace();
		} 
	 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String uid = req.getParameter("user");
		String pwd = req.getParameter("pwd");
		if(uid.equals("john123") && pwd.equals("john123!"))
		{	
			req.setAttribute("name", "john");
			req.setAttribute("loggedin", true);
			req.setAttribute("visit", 1);
			req.getRequestDispatcher("success.html").forward(req, res);
			// forwarded program will use below method to read all information
			req.getAttribute("name" );
			req.getAttribute("loggedin" );
			req.getAttribute("visit" );
			
			//res.getWriter().write(" welcome to our website");
			byte[] responseBinary="welcome".getBytes();
			System.out.print(responseBinary);
			
			req.getSession().setAttribute("login",true);
			boolean x=(boolean)req.getSession().getAttribute("login");
			res.getOutputStream().write(  responseBinary );
		}else
			res.sendRedirect("https://www.google.com");
	}
	
	
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
