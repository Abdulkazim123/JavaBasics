package Classreveiw;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor d=new Doctor();
		d.name="Jhon";
		d.lastName="Deo";
		d.speciallity="Dentist";
		
		
		Doctor.hospital="Inova";
		d.work();
		
		
		Doctor d1=new Doctor();
		d1.name="Jane";
		d1.lastName="smith";
		d1.speciallity="Cardiolgyst";
		d1.work();
		d1.lastName="Bond";
		
		Doctor.hospital="JW Hopspital";
		d1.work();
		
		System.out.println();
		d1.work();
		d.work();
		System.out.println(d1.lastName);
		System.out.println(d.lastName);
			
		 CompanyName();

	}

}
