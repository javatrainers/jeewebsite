package com.servlet;

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

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

@WebServlet("/add2Cart")
public class CartServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String prod = req.getParameter("productName");
		HttpSession session=req.getSession();
		session.invalidate();
		if (session.getAttribute("cart") == null) {
			ArrayList<String> cartList = new ArrayList<String>();
			session.setAttribute("cart", cartList );
		}
		ArrayList<String> cartList
		=(ArrayList<String>)session.getAttribute("cart");
		
		cartList.add(prod);
		res.getWriter().write(cartList.toString());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 	 if (req.getSession().getAttribute("cart") == null) {
				ArrayList<String> cartList = new ArrayList<String>();
				req.getSession().setAttribute("cart", cartList );
			}
		ArrayList<String> cartList =(ArrayList<String>)req.getSession().getAttribute("cart");
	
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req,res);
	}
	/*
	 if (req.getSession().getAttribute("cart") == null) {
			ArrayList<String> cartList = new ArrayList<String>();
			req.getSession().setAttribute("cart", cartList );
		}
		ArrayList<String> cartList =(ArrayList<String>)req.getSession().getAttribute("cart");
	 */
}

/*
		if (req.getSession().getAttribute("cart") == null) {
			ArrayList<String> cartList = new ArrayList<String>();
			req.getSession().setAttribute("cart", cartList);
		}
		ArrayList<String> cartList =(ArrayList<String>)req.getSession().getAttribute("cart");		
*/