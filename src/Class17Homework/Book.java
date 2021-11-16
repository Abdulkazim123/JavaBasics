package Class17Homework;

public class Book {

	//Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
	///Instance variables are being initialized
	//Both Constructors are being executed
	
	
	String name;
	String author;
	String purpose;
	
	public Book() {
		
		
	}
	
		

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
		//this.purpose = purpose;
		System.out.println("The name of this book is " +name+" and the author is "+author);
	}


	
	public Book(String purpose) {
		
		this.purpose = purpose;
		
	System.out.println("The purpose of this book is "+purpose); 
	} 

	
	
	
	
	
}
