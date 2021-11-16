package com.syntaxBatch11Class16;

public class Dog00 {
/// we learn here static method
	
	String name;
	static int noOfLegs=4;
	String color;
	
	void displayColor() {
		System.out.println(color);
	}
	
	void displayName() {
		System.out.println(name);
		
	}
	
	
	
	
	void printInf() {
		displayName();
		displayColor();
		DisplayLegs();
		
	}
	static void DisplayLegs() {
		//System.out.println(name);// not allowed
		System.out.println(noOfLegs);
		
	}
	
	
		
		
	
	
}
