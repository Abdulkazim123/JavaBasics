package Classreveiw;

public class StringMothodStringBuilder {
	
	
	public static void main(String[] args) {
		
		String give="Hello";
		
		StringBuilder sb=new StringBuilder(give);
		 sb.reverse();
		 System.out.println(sb);
		 
		 String reverse="";
		 
		 for(int i=give.length()-1; i>=0; i--) {
		 
		 reverse+= give.charAt(i);
		 }
		 System.out.println(reverse);
		
		 String s="Today I am happ";
		 s=s.substring(6);
		 System.out.println(s);
		 
		 
		s=s.substring(0,4);
		 System.out.println(s);
	}

}
