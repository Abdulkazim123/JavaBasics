package com.syntaxBatch11Class15;

public class DogN {

	
	String name;// instance variable
	String color;//instance variable
	static int noOfLegs=4;
	
	void sleep() {
		int times=3;
		System.out.println(times);
		System.out.println(name+" is sleeping");
		
	}
	void eat() {
		//System.out.println(time);// as time is local variable we can not access it outside of sleep method
		System.out.println(name=" can eat");
		

	}	
}
