package com.syntaxBatch11Class4;

import java.util.Scanner;

public class Scannerdemo2IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("write costumer age");
		
		int age=scan.nextInt();
		
		if(age>=18) {
			
		System.out.println(" We can privide you DL");
		
		}else {
			System.out.println(" Sorry we can not privide you DL");
		}
			 
		 

	}

}
