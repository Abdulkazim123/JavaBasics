package TeamWorkQ5Java;

public class TeamWorkQ10java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a java program to find the second largest number in the array?
		int arr[]= {100,200,300,400,500,600,700,750,800};
		int largest=0;
		
		int secondlargest=0;
		
		for(int num:arr) {
			
			if (num>largest) {
				
				largest=num;
			}}
		for(int num:arr) {
			 if(largest>num && num>secondlargest) {
				secondlargest=num;
			 }
		}
		System.out.println("Second largest number in array is "+ secondlargest); 

		
	}
}
