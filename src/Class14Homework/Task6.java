package Class14Homework;



public class Task6 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not? 
		
		String str = "HANNAH";
        
        
        String rev = (new StringBuilder(str)).reverse().toString();
         
        
        if(str.equals(rev)) {
        	
            System.out.println(str+" is Palindrome.");
        } else {
            System.out.println(str+" is not Palindrome."); 
        }
    }
}

		
	      
		



		
	      
	

