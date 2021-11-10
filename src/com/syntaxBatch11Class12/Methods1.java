package com.syntaxBatch11Class12;

public class Methods1 {
	
	int times;
	
	void sayHello() {
		
		System.out.println("Hello Syntas");
		
		
	}
	void sayHelloManyTimes() {
		
		for(int i=0; i<5; i++) {
			System.out.println("Hello Syntax");
		}
		}
		
		void sayHellomanyTimesWithState() {
			for(int i=0; i<times; i++) {
				
				System.out.println("Hello Syntax");
			}
		}
			void sayHelloManyTimesWithParameter(int times) {
				for(int i=0; i<times; i++) {
				System.out.println("Hello Syntax");
				
			
			}
			}
}


