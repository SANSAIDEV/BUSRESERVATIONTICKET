package com.busreservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookingDAO {

	public int getbookings(int busno, Date date) throws SQLException{
		String query ="select count(PASSENGER_NAME) from BOOKING where BUS_NO =? and DATE_S =?";
		 Connection con = Dbconnection.getconnection();
		 PreparedStatement ps = con.prepareStatement(query);
		 java.sql.Date jus=new java.sql.Date(date.getTime());
		 ps.setInt(1, busno);
		 ps.setDate(2, jus);
		 ResultSet rs= ps.executeQuery();
		 rs.next();
		 return rs.getInt(1);
		 
		
	}

	public void addbooking(Booking bk) throws SQLException {
		String query = "insert into BOOKING values(?,?,?);";
		 Connection con = Dbconnection.getconnection();
		 PreparedStatement pst = con.prepareStatement(query);
		 java.sql.Date jus = new java.sql.Date(bk.date.getTime());
		 pst.setString(1,bk.Passengername);
		 pst.setInt(2,bk.busno);
		 pst.setDate(3, jus);
		
	}

}
