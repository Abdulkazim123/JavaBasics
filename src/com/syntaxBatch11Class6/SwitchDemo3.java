package com.syntaxBatch11Class6;

import java.util.Scanner;

public class SwitchDemo3 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);  // if we wan to convert our variables to UpperCase or LowerCase we use the (variables. to UpperCase or LowerCase)
		
		System.out.println(" please enter your country")
;
		String country =scan.next();
		
		
		
		String language = null;
		
		
		
		switch (country) {
		
		case "Afghanistan":
		
		language="Dari/Farsi";
		break;
		
		case"USA":
			
			language="English";
		break;
		
		default:
		
			language="Unknown";
			
		}
			
	     if(!language.equals("Unknown")) {
	    	
			System.out.println( "In "+country+" people speaks" +language);
			
			
	}else {
		System.out.println("please try another country");
	
	}
			
		
		
		
		
		
		
		
		
		
	}
	

}
