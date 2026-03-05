package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	private static String  url ="jdbc:mysql://localhost:3306/tables";
	private static String user="root";
	private static String pass="DMSA@2005";
	public static Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(url, user, pass);
		}catch(Exception e) {
			System.out.println("exception occured");
		}
		return con;
	}

}
