package com.syntaxBatch11Class5;

import java.util.Scanner;

public class LogicalOrDemoe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" please enter today's day");
		
		String day=scan.next();
		
		if(day.equalsIgnoreCase("monday")|| day.equalsIgnoreCase("Firday")) {
			System.out.println(" no class today");
		
			
			
		}else if(day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("wednesday")) {
			
			System.out.println("we have manual class today");
			
		}else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
			System.out.println("we have java class today");
			
			
		}else if (day.equalsIgnoreCase("Thursday")) {
			System.out.println("we have review class today");
			
		}else {
			System.out.println("wrong input");
				
	}
	}
}
