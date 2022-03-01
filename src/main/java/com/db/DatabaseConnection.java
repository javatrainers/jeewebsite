package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getDBConnection( ) throws Exception
	{
		Connection conn =null;
		try{
		// load database driver
			// printer driver , mouse driver, wifi driver
		Class.forName("com.mysql.jdbc.Driver");
		// JDBC connection string
	    conn = DriverManager.getConnection
	    		("jdbc:mysql://localhost:3306/training","root","root"); 
		  return conn;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
}
