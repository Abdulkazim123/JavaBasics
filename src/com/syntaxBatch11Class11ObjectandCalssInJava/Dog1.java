package com.syntaxBatch11Class11ObjectandCalssInJava;

public class Dog1 {

	String name;
	String breed;
	String color;
	char gender;
	int    age;
	
  void beautiful() {
	  System.out.println(" peter's dog Looks very cute");
  }
	
	void fast() {
		System.out.println("Jack's dog is faser than other dogs");
	}
	
	public static void main(String[] args) {
		
	
		Dog1 jackDog1 =new Dog1();
		
		jackDog1.name   =   "Max";
		jackDog1.breed  =  "Husky";
		jackDog1.color  =  "White";
		jackDog1.gender =  'M';
		jackDog1.age    =   5;
		
		
		Dog1 maryDog1 =new Dog1();
	
		maryDog1.name    =  "Coco";
		maryDog1.breed   =  "Bulldog";
		maryDog1.color   =  "Gray";
		maryDog1.gender  =   'F';
		maryDog1.age     =  '7';
	
		Dog1 peterDog1 = new Dog1();
		
		peterDog1.name    =  "Rocky";
		peterDog1.breed   =  "Labrador";
		peterDog1.color   =   "Black"; 
		peterDog1. gender =  'M';
		peterDog1. age    =  10;
	
	
	System.out.println("Jack dog name is "+jackDog1.name+ " and his dog breed is  "+jackDog1.breed+"  his dog color is   "+jackDog1.color+" his dog gender is "+jackDog1.gender+ " and his age is "+jackDog1.age);
	
	System.out.println();
	System.out.println("mary's dog name is "+maryDog1.name+ " and his dog breed is  "+maryDog1.breed+"  his dog color is   "+maryDog1.color+" his dog gender is "+maryDog1.gender+ " and his age is "+maryDog1.age);
	
	System.out.println();
	System.out.println("peter's dog name is "+peterDog1.name+ " and his dog breed is  "+peterDog1.breed+"  his dog color is   "+peterDog1.color+" his dog gender is "+peterDog1.gender+ " and his age is "+peterDog1.age);  
	
	System.out.println();
	peterDog1.beautiful(); 
	
	System.out.println(); 
	jackDog1.fast();
	}
}
