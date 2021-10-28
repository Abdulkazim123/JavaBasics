package com.syntaxBatch11Class7;

import java.util.Scanner;

public class DoWhileLoopDemo2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner s=new Scanner (System.in);
		
		int mysecretNumber=94;
		
		int userNumber;
		
		
		do {
			System.out.println(" Nasir please guess my secret Number. It is from 1 to 100");
			
			 userNumber=s.nextInt();
			
		}while(userNumber!=mysecretNumber);
		
		System.out.println(" You got it, good luck"); 
			
			
		
		
	
	
		
		
	}
	
}
