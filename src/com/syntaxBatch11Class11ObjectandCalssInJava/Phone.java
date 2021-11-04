package com.syntaxBatch11Class11ObjectandCalssInJava;

public class Phone {

	String  name;
	String  model;
	String  color;
	String  weight;
	String   made;
	
	void better() {
		System.out.println(" Iphone works better than other phones ");
	}
	
	void happy() {
		System.out.println("Overall,I'm happy from IPHONES pruducts");
	}
	
	
	
	public static void main(String[] args) {
		
		Phone myphone =new Phone();
		
		myphone.name="Iphone";
		myphone.model="8 plus";
		myphone.color= "White";
		myphone.weight= "7.13oz";
		myphone.made  ="USA";
		
		
		Phone markphone =new Phone();
		
		markphone.name  ="Android";
		markphone.model ="Google pixel 6";
		markphone.color ="Black";
		markphone.weight ="5.19 oz";
		markphone.made   ="USA";
		
		
		Phone erinphone =new Phone();
		
		erinphone.name  ="Nokia";
		erinphone.model ="G20";
		erinphone.color ="Purple";
		erinphone.weight ="6.95 oz";
		erinphone.made   ="Finlnd";
		
		System.out.println("My phone name is "+myphone.name+ "  the model is " +myphone.model+  "  the color is "+myphone.color+ "the weight is "+myphone.weight+ " and it is made by "+myphone.made);
		
		System.out.println();
		System.out.println("Mark phnon name is "+markphone.name+ "  the model is " +markphone.model+  "  the color is "+markphone.color+ "  the weight is "+markphone.weight+ " and it is made by "+markphone.made);
		
		System.out.println();
		System.out.println("Erin phone name is "+erinphone.name+ "  the model is " +erinphone.model+  "  the color is "+erinphone.color+ "    the weight is "+erinphone.weight+ " and it is made by "+erinphone.made);
		
		 
		System.out.println();
				myphone.better();
				
				System.out.println();
				
				myphone.happy();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}
}
