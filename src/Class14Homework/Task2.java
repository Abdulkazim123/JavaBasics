package Class14Homework;



public class Task2 {

	public static void main(String[] args ) {
		
		//Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.
		
		String str="AGFGhtnbjh547$$^mmmSFfghj#%&89aabbcdur";
		
		int total=0;
		
		for(int i=0; i<str.length(); i++) {
		
		
		
		if( Character.isLetter(str.charAt(i))) {
			
			total++;
		}
		}
			System.out.println("The total of all  alphas are " +total); 
		
		
		}	
}
