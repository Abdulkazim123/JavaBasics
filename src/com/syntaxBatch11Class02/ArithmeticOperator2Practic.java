package com.syntaxBatch11Class02;

public class ArithmeticOperator2Practic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int  number1=10;
		
		int number2=20;
		
		System.out.println(number1+number2);
		System.out.println(number1-number2);
		
		System.out.println(number1*number2);
		
		System.out.println(number1/number2);
		
		
		
		System.out.println("**************************************");
		

		
		double number3=10;
		double number4=20;
	
		
		System.out.println(number3+number4);
		System.out.println(number3-number4);
		System.out.println(number3*number4);
		System.out.println(number3/number4);
	
		
		System.out.println("*****************");
		

		boolean box1= true;

		boolean box2= false;
		
		//System.out.println(box1/box2); Addition, Subtraction, multiplication and division are  not allowed on booleans.	
		
		char char1='A';
		char char2='B';
		
		System.out.println(char1+char2);
		System.out.println(char1-char2);
		System.out.println(char1*char2);
		System.out.println(char1/char2); // plus operator is allowed on char but   computer represent char as number.
		
		
		System.out.println("*****************");
		
		String str1="hi";
		
		String str2="bye";
		
		System.out.println(str2+str2);
				System.out.println(str1-str2); // Subtraction is not allowed on String.
		System.out.println(str1*str2); // Multiplication is not allowed on string.
		System.out.println(str1/str2);// division is not allowed on string
		
		
	}

}
