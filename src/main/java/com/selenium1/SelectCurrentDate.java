package com.selenium1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SelectCurrentDate {
	 public static void main(String[] args) {
		 
		 String date=current_Date();
		 System.out.println(date);
		Future_Date();
		 
		 }
	 
	 public  static String current_Date() {
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
//		 System.out.println(date1);
		 // Print the Date
		return date1;
	 }
	 
	 public static void Future_Date() {
		 Calendar calendar = Calendar.getInstance();
		 calendar.add(Calendar.DAY_OF_YEAR, 3);
		 Date futureDateTime = calendar.getTime();
//		 System.out.println(futureDateTime);
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		System.out.println( sdf.format(futureDateTime));

		 
//		 Date date = new Date();-
//		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
//		 String formattedDate = sdf.format(date);
//		 System.out.println(formattedDate);
		 
	 }

}
