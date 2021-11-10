package Class14Homework;

public class Task5 {

	public static void main(String[] args) {
		// How would you reverse a String word by word?

		String words="I like going beach in the summer";
		
		String arr[]=words.split(" ");
		
		for(int i=arr.length-1; i>=0;  i--) 
		{
			System.out.print(arr[i]+" ");  
		
	}
	}
}
