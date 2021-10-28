package com.syntaxBatch11Class5;

import java.util.Scanner;

public class LogicalAndDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		
		System.out.println("please enter any number");
		
		int number=in.nextInt();
		
		if(number<1) {
			System.out.println("Number is 0 or negative");
		
		}else if(number>=1&&number<=10){
		System.out.println(number+"is small");
		
		if(number>=11&& number<=100){
		
	} else if (number>=11&& number<=100){
		
		System.out.println(number+" is medium");
		
	}else if (number>=101 && number<=1000) {
		
		System.out.println(number+" is larger");
		
		
	}else {
		
		System.out.println(number+" is xlarger");
	

		
	}	
	
		}
}}
