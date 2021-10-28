package com.syntaxBatch11Class6;

import java.util.Scanner;

public class CalculatorUsingIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
	System.out.println(" Please enter two number and operator(+,-,*,/)");
	
	double a =s.nextDouble();
	double b= s.nextDouble();
	 String op=s.next();
	 
	 double num=0.0;
	 
	 if(op.equalsIgnoreCase("+")) {
		num =a+b; 
		 
	 }else if(op.equalsIgnoreCase("-")) {
		 num = a-b;
		 
	 }else if(op.equalsIgnoreCase("*")) {
		 num = a*b;
		 
	 }else if (op.equalsIgnoreCase("/")) {
		 num = a/b;
		 
		 
	 }else {
		 System.out.println("wrong operator");
		 
	 
	 }
		
	 System.out.println("num "  +num);
		
	}

}
