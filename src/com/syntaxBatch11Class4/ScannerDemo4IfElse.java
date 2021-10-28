package com.syntaxBatch11Class4;

import java.util.Scanner;

public class ScannerDemo4IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner work=new Scanner (System.in);
		
		
		System.out.println(" please enter the years that you worked");
		
		int  years =work.nextInt();
		System.out.println(" please enter your annual salay");
		
		int salary=work.nextInt();
		
		if(years>5);
		System.out.println("you are eligble for the bonus");
		
		if(salary>= 50000) {
			
			System.out.println("your bonus is 5000");
			
		}else {
			System.out.println(" your bonus is 3000");
		
		
	
			
		}
		
	}

}
