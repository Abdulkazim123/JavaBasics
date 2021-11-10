package com.syntaxBatch11Class14;

import java.util.Arrays;

public class StringNew1REX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Today is Tuseday. Today we have java class.";
		String []  strArr=str.split(" ");
		
		System.out.println(Arrays.toString(strArr));

		
		for(String s:strArr) {
			System.out .println(s);
		}
	
	}
}
