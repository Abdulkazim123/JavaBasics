package com.syntaxBatch11Class14;

public class StringNew2REX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is Batch 11 Batch 11 is good";
		System.out.println(str.replace("good, ", "great"));
		
		str="This is Batch 11 is good Batch 11 is good";
		System.out.println(str.replace("good", "great"));
		System.out.println(str.replace("good", "great").replace(" Batch", "Not Batch"));
		System.out.println(str.replaceFirst("good", "great"));

		
	}

}
