package TeamWorkProject;

import java.util.Scanner;

public class TeamWorkQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reate an array on double values using scanner 
		 // and calculate the sum of all stored elements in that array.
		 
Scanner scan=new Scanner(System.in);

double[] arr= new double[3];

double sum=0;


for(int i=0; i<arr.length;i++) {
	
	System.out.print("Please enter index "+ "i"+" number that you store ");
	
	 arr[i]=scan.nextDouble();
	
	      sum+=arr[i];
}
System.out.println("Sum of elements "+sum);  
		
	}

}
