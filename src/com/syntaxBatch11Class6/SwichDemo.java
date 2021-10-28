package com.syntaxBatch11Class6;

public class SwichDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 char  gender ='d';
		 String description;
		 
		 
		  switch (gender) {
		  
		  case'm':
			  description="Male";
			  break;
			  
		  case'f':
			  description="female";
			  break;
			  
			  default:
				  description="Unknown";
				  
				  System.out.println(gender  +"  means  "+description);
				  
				// Limitation on Switch case  
			  
			 //1. we can not use logical operators
			 
			 //2. we can not use relational operators
				  
				  //Limitation of data Types
				  
			//1.  we can not  use Switch case on Boolean/ Float
			//2. we can not use Double on Switch case	
			//3. we can not use long	  
				  
		  
			  
		  }
		 
	}

}
