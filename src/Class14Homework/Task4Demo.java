package Class14Homework;

public class Task4Demo {

	public static void main(String[] args) {
		// How would you reverse a String character by character?
		
		String str="Syntax is a best place to learn Java";
		String [] strArr=str.split(" ");	
		
		for(String word:strArr) {
			StringBuilder stringBuilder=new StringBuilder(word);
			System.out.print(stringBuilder.reverse());
			
		}

	}

}
