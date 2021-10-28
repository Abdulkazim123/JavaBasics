package com.syntaxBatch11Class7;

import java.util.Scanner;

public class whileLoopDemo5Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		
		int i=5;
		
		while(i>=1) {
		
		System.out.println("please enter your name and age");
		
		String name=s.next();
		
		int age=s.nextInt();
		
		System.out.println(" your name is "+name+" and your age is "+age+" yours old");
		 
		i--;
		 
		
		}
		
	}
}
