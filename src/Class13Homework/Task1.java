package Class13Homework;

public class Task1 {

	public static void main(String[] args) {
		

		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
		
		String name =("Kazim");
		
		System.out.println(name.isEmpty());
		
	
			if(!(name.length()%2==0)&&(name.length()>=3)) {
		System.out.println("The middle character of  " +name+ "  is " +name.charAt(name.length()/2) );  
			

}
		
	}		

}

	
