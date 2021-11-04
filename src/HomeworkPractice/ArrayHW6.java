package HomeworkPractice;

public class ArrayHW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char [] grades= {'A', 'B', 'C', 'D'};
		for( char grade:grades) {
			
			System.out.print(grade+" ");
			
			
		}
		System.out.println();
		System.out.println("***********");
		
		//reverse
		
		for(int k=grades.length-1; k>=0;  k--) {
			
			System.out.println(grades[k]+" ");
		}
	}

}
