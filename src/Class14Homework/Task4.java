package Class14Homework;

public class Task4 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?
		
		String str1="Syntax is a best place to learn Java";
		String str2="";
		
		for(int i=str1.length()-1; i>=0; i--) {
			str2+=str1.charAt(i);
		}
			System.out.println("The reverse of this charater is>     "+str2); 
		

	}

}
