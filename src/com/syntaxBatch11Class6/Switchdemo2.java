package com.syntaxBatch11Class6;

import java.util.Scanner;

public class Switchdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter a country");
		
		String country=scan.next();
		
		String food= null;
		
		switch(country){
		
		
		case"Afghanistan":
			
			food = "Lamb kabab";
			
			break;
			
		case"USA":
			
			food= "Pizza";
			break;
			
		default:
			
			food="Unknown";
			
		
		}
		if(!food.equals("Unknown")) {
			
						
				System.out.println("your favorite food is  "+food);
				
		
		}else {
			System.out.println("please try another country");
		}
			
			
			
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
