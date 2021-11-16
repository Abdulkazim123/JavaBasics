package com.syntaxBatch11Class16;

public class AccessModifierD1 {

	 private String name;
	int age;
	 public double salary;
	
	void displayName() {
		System.out.println(name);
		
	}
	void displayAge() {
		System.out.println(age);
		
	}
	void displaySalary() {
		System.out.println(salary);
		
	}
	
	public static <AccssModefierD1> void main(String[] args) {
		
		AccessModifierD1 am=new AccessModifierD1();
		
		
				am.name="kazim";
				am.age=26;
				am.salary=120000;
				am.displayName();
				am.displayAge();
				am.displaySalary();
				
	}
}
