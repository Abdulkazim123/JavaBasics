package com.syntaxBatch11Class11;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Human nasir=new Human();
		
		nasir.name="Nasir";
		nasir.age=35;
		nasir.height=5.9;
		nasir.weight=80;
		nasir.gender='M';
		nasir.bloodType="A+";
		
		
		nasir.eat();
		nasir.sleep();
		nasir.walk();
		
		System.out.println("***************");
		Human sahil=new Human();
		
		sahil.name="sahil";
		sahil.age=14;
		sahil.height= 4.5;
		sahil.weight=100;
		sahil.gender='M';
		sahil.bloodType="A-";
		sahil.eat();
		sahil.sleep();
		sahil.walk();
		sahil.sendMemes();
		System.out.println(sahil.age); 
		
		
	}

}
