package com.busreservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Dbconnection {
	private static final String url = "jdbc:mysql://localhost:3306/BUSRESERV";
	private static final String username="root";
	private static final String password ="5855";
	
	public static Connection getconnection() throws SQLException{
		return DriverManager.getConnection(url,username,password);
		
	}


}
