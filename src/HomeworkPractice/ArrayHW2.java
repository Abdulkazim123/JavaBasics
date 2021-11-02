package HomeworkPractice;

public class ArrayHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] animals=new String[6];
		
		
		animals[0]="Lion";
		animals[1]="Wolf";
		animals[2]="Deer";
		animals[3]="Horse";
		animals[4]="Sheep";
		animals[5]="Fish";
		
		for(int k=0; k<animals.length; k++) {
			
			System.out.print(animals[k]+" ");
		}
		
		System.out.println();
		System.out.println("****************");
		
		for(String St:animals) {
			
			System.out.print(St+" ");
		}
	}
}
