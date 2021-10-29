package com.syntaxBatch11Class4;

import java.util.Scanner;

public class ScanDemo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner scan=new Scanner (System.in);
		
		String  name=scan.next();//it will capture string value from console
		
		
		System.out.println("Hello "+name);
		
		System.out.println("please enter your age");
		
		 int age =scan.nextInt();
		
		 System.out.println(name+ "Nasir you are  "+age+ "years old");
		 
		 String city=scan.next();
		 
		 System.out.println("Nasir you are"+age+"  years  old and you are from Lakeridge");
		 

	
	}

}
