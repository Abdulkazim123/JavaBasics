package Class13Homework;

public class Task3D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Fname="Daniel";
		String Mname="Mary";
		String isBoyGirl="girl";
		
		if(isBoyGirl.equalsIgnoreCase("Boy")) {
			
			String firstpart=Fname.substring(0,Fname.length()/2);
			String secondpart=Mname.substring(Mname.length()/2);
			
			System.out.println(firstpart+secondpart);   
			
			
		}else {
		String firstpart=Mname.substring(0,Fname.length()/2);
			String secondpart=Fname.substring(Mname.length()/2);
			System.out.println(firstpart+secondpart);
			
		}
		
	}

}
