package com.syntaxBatch11Class10;

public class Array2Ddemoe3enhaceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String [][] groceries= {
				
				{"banana", "apple", " mango"},
				
				{"potato", " tomat"},
				
				{"milk", "cheese", "orange", "yogurt"}
		};
		
		for( String[] gro:groceries) {
			
			for( String g:gro) {
				
				System.out.print(g+" ");
			}
		}
		
	}

}
