package HomeworkPractice;

import java.util.Scanner;

public class ArrayHW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner s=new Scanner (System.in);
		
		System.out.println("please enter how many elements you want to store inside array of cars");
		
		int size=s.nextInt();
		
		String [] cars= new String[size];
		
		for(int k=0; k<cars.length; k++) {
		
		System.out.println("please enter your cars");
		
		cars[k]=s.next();
		
		}
		for(String car:cars) {
			
			System.out.println(car+" ");
		}
		
		
	}
	
}
