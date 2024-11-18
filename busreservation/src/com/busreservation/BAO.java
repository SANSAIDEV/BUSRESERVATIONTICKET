package com.busreservation;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class BAO {
   public static void display() throws SQLException{
	 String query ="select * from bus";
	 Connection con = Dbconnection.getconnection();
	 Statement st = con.createStatement();
	 ResultSet rs=st.executeQuery(query);
	 while(rs.next()) {
		 System.out.print(" Bus no "+rs.getInt(1));
		if(rs.getInt(2)==0) {
			System.out.println("yes");
			
		}else {
			System.out.println("No");
		}
		System.out.println("Capacity "+rs.getInt(3));
		
	 }
	 System.out.println("------------------------------------");
	 
   }
   public int getcapacity(int id) throws SQLException{
	   String query = "select capacity from bus where BUS_NO ="+id+";";
	   Connection con = Dbconnection.getconnection();
		 Statement st = con.createStatement();
		 ResultSet rs=st.executeQuery(query);
		 rs.next();
		return  rs.getInt(1);
	   
	  
   }
   
}
