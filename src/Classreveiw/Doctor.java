package Classreveiw;

public class Doctor {
	
	String name;
	String lastName;
	String speciallity;
	double salary;
	
	
	static String hospital;
	
	void printinfo() {
		
	}
	
	void work() {
		System.out.println(name+" works at hospitals"+hospital);
	}
	void getpaid() {
		System.out.println(name+ "gets paid "+salary);
	}
	static void CompanyName() {
		System.out.println("All doctors work at "+hospital);
	}

}




