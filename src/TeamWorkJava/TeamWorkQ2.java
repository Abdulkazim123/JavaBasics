package TeamWorkJava;

public class TeamWorkQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Create a 2D array or integer type where you will store odd and even numbers. Develop a program which will identify/print the even numbers only.
		
		
int   [][] nums ={
				
				{10, 20, 5, 15, 18},
				
				{4,  7,  8,  11, 14},
				
				{6,  3,  2,  5, 16},
				
				{22, 43, 94, 61, 82},
				
				{101, 210, 189, 344,456},
	};

	
	
		System.out.println("The  Even numbers of interger in 2D  Array  are");
		
		int even=0;
		
		for (int k = 0;  k<nums.length;  k++) {
			
		
			for(int m=0; m<nums[k].length; m++) {
				
				even=nums[k] [m];
			
		if(nums[k][m]%2==0) {
			
			System.out.print(nums[k][m]+"    ");	 
	}
			}
}}}
			