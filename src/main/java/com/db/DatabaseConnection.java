package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getDBConnection( ) throws Exception
	{
		Connection conn =null;
		try{
		// load database driver
		Class.forName("com.mysql.jdbc.Driver");
		// JDBC connection string
	    conn = DriverManager.getConnection
	    		("jdbc:mysql://127.0.0.1:3306/training","root","root"); 
		  return conn;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
}
