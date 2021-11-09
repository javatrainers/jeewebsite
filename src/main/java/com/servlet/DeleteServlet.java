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

@WebServlet("/deleteRecord")
public class DeleteServlet extends HttpServlet {

	// userid=john&pwd=jane
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		Connection con = null;
		try {
			String uid = req.getParameter("userid");
			con = DatabaseConnection.getDBConnection();
			UsersTable.deleteUser(uid, con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doGet(req, res);
	}

}
