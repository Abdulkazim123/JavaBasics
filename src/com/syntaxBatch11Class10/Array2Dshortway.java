package com.syntaxBatch11Class10;

public class Array2Dshortway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] groceries= {
				
				{"banana", "apple", " mango"},
				
				{"potato", " tomat"},
				
				{"milk", "cheese", "orange", "yogurt"}
		};
		System.out.println(groceries.length);
		
		System.out.println(groceries[2][3]);
		
		// I want to find how many elements my 1 array has
		
		System.out.println("# of elements inside array with index 0="+groceries[0].length);
		
		System.out.println("# of elements inside array with index 0="+groceries[1].length);
		System.out.println("# of elements inside array with index 0="+groceries[2].length);
		
		
		
		
		System.out.println("********");
		
		// how we get all the elements from 2d array.
		
		for( int k=0; k< groceries.length;  k++) {
			
			for( int m=0; m<groceries[k]. length; m++) {
				
				System.out.println(groceries[k][m]+" "); 
				
				
			}
			
		}
		
		
	}

}
