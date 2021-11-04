package com.syntaxBatch11Class11ObjectandCalssInJava;

public class Car {

	
		
	
	String make;
	String model;
	String color;
	int     year;
	double  mlilage;
	 void moveForward() {
		 
		
		 
		 System.out.println("moving forward");
	 }
	 
	 void apllyBreak() {
		 
		 System.out.println("Applying break");
	 }
		
	 void hank() {
	 
		 System.out.println("Hanking");
	 }
	 
	
	 public static void main(String[] args) {
		Car nasirCar=new Car();
	 
		nasirCar.make="cadillic";
		nasirCar.model="S";
		nasirCar.color="Black";
		
		System.out.println("Nasir Car is  "+nasirCar.make);
		System.out.println("Nasir Car model is "+nasirCar.model );
		System.out.println("Nasir car color is "+nasirCar.color);
		 
		nasirCar.moveForward();
		nasirCar.apllyBreak(); 
		nasirCar.hank(); 
		
		
		 
	}
	
	
}
