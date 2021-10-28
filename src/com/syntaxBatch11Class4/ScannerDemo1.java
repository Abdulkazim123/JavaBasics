package com.syntaxBatch11Class4;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter your item you want to purchase");
		
		String item=scan.next();
		System.out.println("please enter the price of the "+item);
		
		double price=scan.nextDouble();
		System.out.println("you selected "+item+" with price ="+price);
		
		
		
	
		
		
	}

}
