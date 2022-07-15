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
@WebServlet("/checkUser")
public class CheckUserServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		
		String newUserid= req.getParameter("userid");
		ArrayList<String> regUsers=new ArrayList<String> ();
		regUsers.add("john"); regUsers.add("jane"); 
		if(regUsers.contains(newUserid) )
			res.getWriter().write("unavailable");
		else
			res.getWriter().write("available");
		
		res.getWriter().flush();
		res.getWriter().close();
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		doPost(req,res);
	}
}