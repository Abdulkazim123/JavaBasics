package TeamWorkProject;

public class teamWorkQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//rite a Java Program to print the first 10 numbers of Fibonacci series.
		 
		
		   int n = 10, num1 = 0, num2 = 1;
		    System.out.println("first 10 numbers of fibonacci series are ");

		    for (int i = 1; i <= n; i++) {
		      System.out.print(num1 + ", ");   
		      
		      //for next step
		      int num = num1 +num2;
		      num1 = num2; 
		     num2 = num;
	}
	}

}
