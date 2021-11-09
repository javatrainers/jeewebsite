package com.servlet;

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

import com.db.DatabaseConnection;
import com.db.UsersTable;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;

@WebServlet("/createRecord")
public class CreateServlet extends HttpServlet {

	// userid=john&pwd=jane
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String uid = req.getParameter("userid");
		String pwd = req.getParameter("password");
		
		Connection con = null;
		try {
			con = DatabaseConnection.getDBConnection();
			con.setAutoCommit(false);
			UsersTable.registerUser(uid, pwd, con);
			con.commit();
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req, res);
	}

}
