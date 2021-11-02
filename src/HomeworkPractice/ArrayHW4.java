package HomeworkPractice;

public class ArrayHW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array on integers and calculate the sum of all elements in an array
		
		int sum = 0;
		
		int [] numbers= {12, 19, 24, 66,74,96};
		
		for(int k=0; k<numbers.length;  k++) {
			
			 sum += numbers[k];
			 
		}
			
		System.out.println("The sum of these numbers are "+sum); 
			
			
		
		
		
		
	}

}
