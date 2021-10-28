package com.syntaxBatch11Class5;

import java.util.Scanner;

public class LogicalAnddemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter a number of day");
		
		int weekday=scan.nextInt();
		
		if(weekday>=1 && weekday <=5) {
			System.out.println("it is a weekday");
			
			
		}else if (weekday>=6 && weekday <=7) {
			System.out.println("it is a weekend");
			
		}else {
			System.out.println("invalid day");
		}
	}

}
