package Class13Homework;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		
		//* Write a program that reads two people's first
		//names and if they expecting boy or girl? Based on the input suggests a name for a baby:  
		
		
		Scanner s=new Scanner (System.in);    
		
		
		
		System.out.println("What is your Father name?");
		 String Fname=s.next();
		 System.out.println("What is your Mother name?");  
		 String Mname=s.next();
		 System.out.println("Boy or Girl ?");
		 String babyn=s.next();
		 
		
		 if(babyn.equals("Boy")) {
			 
			 babyn=Fname.toUpperCase().substring(0,3)+Mname.toUpperCase().substring(Mname.length()-2,4);  
			 System.out.println(babyn);
			 
			 
			 
			 
		 }else if (babyn.equals("Girl")){
			 
			 babyn=Mname.toUpperCase().substring(0,3)+Fname.toUpperCase().substring(Fname.length()-2,Fname.length()); 
			 System.out.println(babyn);    
		 
		 
		 
	
		 
		
		
		
				

		
		 
		 }	
	
	}
}
