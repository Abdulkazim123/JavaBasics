package com.syntaxBatch11Class10;

public class Array2DSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] nums = {
		        {3,2,1},
		        {3,3,2},
		        {3,5,3},
		        {0,1,2}
		    };
		    
		    int sum = 0;
		    
		    for (int i=0; i<nums.length;i++){
		    	
		      for (int j=0;j<nums[i].length;j++){
		    	  
		         sum+= nums[i][j];
		         
		      }
		      
		    }
		        System.out.println("The sum of all these numbers are  " +sum);
		      
		      
		
		
	}
	
}
