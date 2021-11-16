package com.syntaxBatch11Class17Construct;

public class Dog {
	
	private String name;
	private String color;
	private String breed;
	private int age;
	private double weight;
	public Dog(String dogName, String dogColor, String dogBreed, int dogAge,double dogWeight) {
		// if we not declare something here  on the public Dog then it will be Default Constructor.
		System.out.println("Dogs constructor is called");
		
		name=dogName;
		color=dogColor;
		breed=dogBreed;
		age=dogAge;
		weight=dogWeight;
		System.out.println(dogName); 
		printAge();
	
		
	}
	public void printName() { 
		System.out.println(name);
	}
	public void printBreed() {
		System.out.println(breed);
	}
	public void printAge() {
		System.out.println(age);
	}



}
