package com.syntaxBatch11Class13StringCAndManipulation;

public class StirngAndClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="This class is easy";
		
		System.out.println(name.contains("class"));
		System.out.println(name.contains("lemon"));
		System.out.println(name.contains("i"));
		
		 System.out.println("************");
		 String str2="Hello";
		 String str3="helhtttrrlo";// here the first 'l' on index 2 and second 'l' is on index 9.
		 System.out.println(str2.equals(str3));
		 System.out.println(str2.equalsIgnoreCase(str3));
		 
		 
		 System.out.println("*************");
		
		 System.out.println(str2.charAt(4));
		 
		 System.out.println(str3.indexOf('l',str3.indexOf('l')+1)); //here we look for 'l' and on index 9 so the result counts and show us 'l' on index 9 with result of 9.
		 // we put +1 that java takes us to the 'l' on index 9 , if we not use +1 so it only shows 'l' on index 2.
		 
		 
		 System.out.println("************");
		 System.out.println(name.substring(4)); //if we put 4 here then java will ignore the first 4 letter and execute after those.
		 
		 System.out.println(name.substring(5,11));// here we start from index 5 to 11 and it gives us just class. 

	}

}
