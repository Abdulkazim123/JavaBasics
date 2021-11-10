package TeamWorkProject;

public class TeamWorkQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a 2D array of integers. 
		
		 //Develop a program which will calculate the sum of  even and odd numbers for that array.
		 

		int [][] num= {
				
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		int evensum=0;
		int oddsum=0;
		
		for(int i=0; i<num.length; i++) {
			
			for(int j=0; j<num[i].length; j++) {
				
				if (num[i][j]%2==0) {
					
					evensum+=num[i][j];
					
				} else {
					oddsum+=num[i][j];
					
				}
			}
		}
		System.out.println("Sum of even numbers is "+ evensum);
		System.out.println("Sum of odd numbers is "+ oddsum);   
		
	}

}
