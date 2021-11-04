package com.syntaxBatch11Class10;

public class Array2Ddemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][]numbers= {
				
				{100, 200, 300},
				{9, 8, 7},
				
		};
		
		System.out.println("size of 2D array ="+numbers.length);
		
		System.out.println(numbers[1][1]);
		
		
		// enhaced Loop
		
		for(int[] nums:numbers) {
			
			for(int n:nums) {
				
				System.out.println(n+" ");
			}
		}
	}
}
