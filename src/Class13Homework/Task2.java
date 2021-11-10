package Class13Homework;

public class Task2 {

	public static void main(String[] args) {
		
		
		// Create a String and print it in reverse order (Sunday → yadnuS).
		
		
		String day=("Sunday");
		String reverseType="";
		
		for( int i=day.length()-1; i>=0; i--) {
			
			 reverseType +=day.charAt(i);
		}
			System.out.println(reverseType);  

	}
	

	
	
}
