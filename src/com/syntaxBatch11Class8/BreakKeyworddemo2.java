package com.syntaxBatch11Class8;

import java.util.Scanner;

public class BreakKeyworddemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		
		String item;
		double price;
		double money = 0;
		double reminder;
		double sum=0;
		
		System.out.println(" please enter that you are willing to buy");
		 item =s.next();
		 
		 System.out.println("please  enter the price");
		  price=s.nextDouble();
		  
		  do {
		  System.out.println("please pay for the "+item);
		  money=s.nextDouble();
		  
		  sum+=money;
		  
		  
		  if(sum>price) {
			  
			  double change=sum-price;
			  
			  System.out.println("please take your change" +change);
			  break;
			  
		  }else if(sum<price) {
			   reminder = price-sum;
			  
			  System.out.println("please give me more "+reminder);
			  
		  }else {
			  System.out.println("you go the exact amount");
			  
			  
		  }
		  
		  }while(sum!=price);
		  
		  System.out.println(" Thanks for choosing us"); 
	}
		


	
	

}
