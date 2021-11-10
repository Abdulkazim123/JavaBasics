package com.syntaxBatch11Class14;

public class StringNew3REX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ffggaGHHHDFjhjk99885hhhhii66SJUYH&%$$86@#$^&((&$%$@";
		System.out.println(str.replaceAll("[0-5]", "*"));
		System.out.println(str.replaceAll("[a-z]", "*"));
		System.out.println(str.replaceAll("[A-Za-z]", "*"));// we can use this sorter way to replace all Upper and Lower case letter.
		System.out.println(str.replaceAll("[A-Z]", "*").replaceAll("[a-z]",  "*"));
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "*"));//here we say do not replace these elements and replace all other elements.
		System.out.println(str.replaceAll("[$&]", "*"));
		System.out.println(str.replaceAll("[0-9]", ""));//If we want to remove any characters from our platform, we use this way.for example ,I removed all the numbers here.  
		

	}

}
 