package com.syntaxBatch11Class6;

import java.util.Scanner;

public class CalculatorSwitchCaseDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner  opSwitch =new Scanner (System.in);
		
		System.out.println("please enter number1");
		
		
		int a= opSwitch.nextInt();
		
		System.out.println("please enter number 2");
		int b= opSwitch.nextInt();
		
		System.out.println("Please enter your operator");
		
		char op=opSwitch.next().charAt(0);
		
		
		int solve= 0;
		
		switch(op) {
		
		case'*':
		
		solve =a*b;
		break;
		
		case '/':
			
			if(b!=0) {
				
			
			solve = a/b;
			
			}else {
				System.out.println(" number connot dividied by)");
			}
		break;
		
		case '+':
		solve = a+b;
		 break;
		 
		case '-':
			
		solve = a-b;
		
		break;
		
		
		
		default:
			System.out.println("Entry is Invalid");
			
		}
		

			
		
		System.out.println(solve);
		
		
		
			
			
		}

		
	

}
