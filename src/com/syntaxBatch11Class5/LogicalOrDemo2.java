package com.syntaxBatch11Class5;

import java.util.Scanner;

public class LogicalOrDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println(" please enter today's day");
		 int day=scan.nextInt();
		 
		 if(day==1 || day==2 ||  day==3 ||  day==4 || day ==5) {
			 System.out.println("It is weekday");
			 
			 
			 
		 }else if (day==6 ||day == 7) {
			 System.out.println("It is  weekend");
			 
		 
		 }else {
			 System.out.println("Invalid day");
			 
		 }

	}

}
