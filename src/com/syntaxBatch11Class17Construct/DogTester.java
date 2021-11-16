package com.syntaxBatch11Class17Construct;



public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog	dog=new Dog("Boby", "Black", "BullDog", 10,12.5);
		//dog.name="Boby"// not allowed as its private
		dog.printName();
		dog.printAge();
		
	}

}
