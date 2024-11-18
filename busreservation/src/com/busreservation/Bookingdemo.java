package com.busreservation;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
public class Bookingdemo {

	public static void main(String[] args)  {
		try {
		BAO bao = new BAO();
		bao.display();
		Scanner scan = new Scanner(System.in);
		int user = 1;
		while(user==1) {
	    	System.out.println("Enter 1 to book and 2 to exit");
			user=scan.nextInt();
			if(user==1) {
				Booking book = new Booking();
				if(book.isAvilable()) {
			    BookingDAO bk = new BookingDAO();
			    bk.addbooking(book);
				System.out.println("booking is Confirmed");
				}else {
					System.out.println("booking is full choose another bus or date");
				}
				
			}
			
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
