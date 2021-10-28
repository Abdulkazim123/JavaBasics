package com.syntaxBatch11Class4;

import java.util.Scanner;

public class ScannerDemo3IFElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Do you have credit card?");
		
		String stutus= scan.next();
		
		if(stutus.equals("yes")) { // when we use string value we use (equals) instead two == signs.
		
		System.out.println("what is the balance on your credit card?");
		
		double  balance =scan.nextDouble();
		 if(balance >10000) {
			 
			 System.out.println("pay it off immediatly");
			 
			 
		 }else {
			 System.out.println("you need to spend more");
			 
			 
		 }
		
		}else {
			System.out.println(" would like to get a credit card?");
		
		}
	}

}
