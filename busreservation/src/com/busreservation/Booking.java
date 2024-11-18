package com.busreservation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Booking {
	String Passengername;
	int busno;
	Date date;
  Booking(){
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter passenger name");
	  Passengername = scanner.nextLine();
	  System.out.println("Enter busno");
	  busno=scanner.nextInt();
	  System.out.println("Enter date in dd-MM-yyy ");
	  String d= scanner.next();
	  SimpleDateFormat dateform = new SimpleDateFormat("dd-MM-yyyy");
	  try {
		date = dateform.parse(d);
	} catch (ParseException e) {
		e.printStackTrace();
	}
  }
public boolean isAvilable() throws SQLException{
	BAO ba = new BAO ();
	int capacity=ba.getcapacity(busno);
	BookingDAO bdao = new  BookingDAO();
	int booked=bdao.getbookings(busno,date);
	
	return booked<capacity;
}

}
