package com.syntaxBatch11Class14;

public class StringBclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="This is Lubo. Lubo is break manager.";
		System.out.println(str.replace("Lubo", "Sorbon"));//Here we replaced Lubo to Sorbon
		
		System.out.println(str.replaceAll("Lubo", "Sorbon"));
		
		
		String str2="kagkhhfhdjDJKHGGHJHJKjhgj1234#$^*";
		System.out.println(str2.replaceAll("[^A-za-za0-9]", ""));//we use replaceAll for regular expression
		
		System.out.println(str2.replace("[^A-Za-z0-9]", ""));
		
		
		String str3="";
		//String is not recommended because every time it will search the memory and that will slow down the code.
		for(int i=0; i<5;  i++){//here we use string class 
			str3=str3+i;
		}
		System.out.println(str3);
		
		
		
	StringBuilder stringBuilder= new StringBuilder();
	//When we have to change the value of a string variable always ,we usetringBuilder class.
	for(int i=0; i<5; i++) {
		stringBuilder.append(i);
	}
	System.out.println(stringBuilder);
	
	String str4="I love learning java";
	
	StringBuilder strBuilder=new StringBuilder(str4);
	strBuilder.reverse();
	System.out.println(strBuilder); 
	}

}
