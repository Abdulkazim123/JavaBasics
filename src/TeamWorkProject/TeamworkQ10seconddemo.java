package TeamWorkProject;

public class TeamworkQ10seconddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] numbers= {40, 30, 20, 10 , 30};
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MAX_VALUE;
		
		
	
		for( int number:numbers) {
		
		if( number>largest) {
			secondlargest=largest;
			largest=number;
			
			
		}else if(number>secondlargest&&largest!=number) {
			
			secondlargest=number;
			
		
			System.out.println("Largest"+largest);
			System.out.println("Second largest"+secondlargest);
		
		}
		}
	}
		
}
