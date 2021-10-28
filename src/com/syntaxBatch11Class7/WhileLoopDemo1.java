package com.syntaxBatch11Class7;

public class WhileLoopDemo1 {// incrementAndDecrement

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time =14;
		if(time<17) {
			
			System.out.println(" It is a day");
		}
		
		while(time<17) {
			System.out.println("It is a day"); //We use While Loop when we don't know how many times we have to repeat block of code.
			time++;
/// If we add - and - then the code will go to infinite.			
		}
		
	}

}
