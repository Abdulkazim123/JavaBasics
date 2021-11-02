package HomeworkPractice;

public class ArrayHW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cars=new String[6];
		
		cars[0] =  "Toyota";
		cars[1] =  "Cadillac";
		cars[2] =  "Jeep";
		cars[3] =  "Ford";
		cars[4] =  "Acura";
		cars[5] =  "Lexux";
		
		for( int i=0;  i<cars.length;  i++) {
			
			System.out.print(cars[i]+" ");
		
		}
		System.out.println();
		System.out.println("________________");
		
		
		for(String  st : cars ) {
			System.out.print(st+" ");
			
		}
	}
	
	
}
