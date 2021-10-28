package com.syntaxBatch11Class5;

import java.util.Scanner;

public class LogicalOrdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner (System.in);
		
		System.out.println("please enter your birth month");
		
		
		String month=s.next();
		
		String season = null;
		
		if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("january") || month.equalsIgnoreCase("February")) {
		
		season= "winter";
		
		}else if( month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			
			season="Spring";
			
		}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			
			season= "Summer";
			
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			
			
		}else {
			season="Invalid";
		}
			System.out.println("Your born season is " +season);
			
		}
		
	

}
