package com.syntaxBatch11Class5;

import java.util.Scanner;

public class LogicalAnddemo3 {

	private static int finalGrade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int quizeScore, midGrade, finalScore, average;
		
		String grade = null;
		
		
		System.out.println(" please enter your quizScore");
		quizeScore=s.nextInt();
		
		System.out.println("please enter your midGrade");
		
		midGrade=s.nextInt();
		
		System.out.println("please enter your finalScore");
		
		finalScore=s.nextInt();		
		
		
		
		
		average= (quizeScore+ midGrade+ finalGrade) /3;
		
		if(average>=90) {
		grade ="A";
		
	}else if(average >=70 && average <90) {
		grade="B";
		
	}else if(average >=50 && average <70) {
		grade="C";
		
	}else if(average <50) {
		
		grade="F";
		
	}
		
		System.out.println(" Your grade is " +grade);
		
				
	}
			
	

}
