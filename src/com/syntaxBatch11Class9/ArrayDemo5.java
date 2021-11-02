package com.syntaxBatch11Class9;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] num=new double[3];
		num[0]=10.99;
		num[1]= 15.88;
		num[2]=88.88;
		
		
		num[1]=200.00;// replaced this value with value 15.88 by using System.out.println(+num[1]); .
		//Otherwise , we use this System.out.println(num[1] to print our real values
		
		System.out.println(+num[1]);
		
		
		
	}

}
