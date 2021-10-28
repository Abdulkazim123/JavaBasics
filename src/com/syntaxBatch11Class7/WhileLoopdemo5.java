package com.syntaxBatch11Class7;

import java.util.Scanner;

public class WhileLoopdemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int secretNumber=88;
		
		int usernumber;
		
		System.out.println("please guess my secret numbe and, it is starting from 1 to 100");
		
		usernumber=s.nextInt();
		
		while(usernumber!=secretNumber) {
			
			System.out.println("please  guess my secret number and, it is starting from 1 to 100");
			
			usernumber=s.nextInt();
			
			
			
			
		}
			System.out.println("Great, you were able to guess my secret number.");
			
			
			
			
			
			
	
		}
		
		
		

}
