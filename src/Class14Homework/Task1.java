package Class14Homework;

public class Task1 {

	public static void main(String[] args) {
		
		// Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String str="The weather is beautiful";
		
		System.out.println(str.replace(" ", "")); 
		
		str=str.replaceAll("\\s", ""); //here we reassign
		
		System.out.println(str.replaceAll(" ", " "));//here we reassign
		
		System.out.println(str);//here we will get space
		
		StringBuilder str2=new StringBuilder("The waether is beautiful");//if we use StringBuilder we will not got space.
		
		System.out.println(str2.reverse());
		
		System.out.println(str2);//if we compare this section with line 13 it not showing us space and line 13 does.
		
		

	}

}
