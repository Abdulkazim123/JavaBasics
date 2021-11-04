package com.syntaxBatch11Class10;

public class Array2Ddemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] nums= {{10, 12, 15},
		                 {6, 8,    9},
		                 {3, 5,    7}, 
		                 
		};
		int [][] nums1=new int[3][3];
		
		nums1[0][0]=10;
		nums1[0][1]=12;
    	nums1[0][2]=15;
    	nums[1][0] =6;
    	nums[1][1] =8;
    	nums[1][2] =9;
    	nums[2][0] =3;
    	nums[2][1] =5;
    	nums[2][2] =7;
    	
    	System.out.print(nums[1][2]);
						
	

	System.out.println();
	System.out.println("*********");
	// If we want to print different method at the same time then we use this method.
	
	for(int k=0;  k<3;  k++) {
		
		System.out.println(nums[k][k]); 
		
	}
	System.out.println("*************");
	
	// If we want to print all then we use this method.
	
	for(int k=0;  k<3;  k++) {
	
	for (int m=0; m<3; m++) {
	
	
	System.out.println(nums[k][m]); 
	
	}
	
	}
	}	
}