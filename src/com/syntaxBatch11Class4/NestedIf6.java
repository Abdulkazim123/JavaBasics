package com.syntaxBatch11Class4;

public class NestedIf6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=16;
		
		double weight=110;
		
		if(age>=18) {
			
			System.out.println("you are eligble to donate blood");
			
			
			if(weight>=110) {
				System.out.println("we can accept pateint");
			}else {
				
				System.out.println("we are not accept the pateint");
			
			}
		}else {
			
			System.out.println("you are not eligble to donate blood");
		}
				
		

	}

}
