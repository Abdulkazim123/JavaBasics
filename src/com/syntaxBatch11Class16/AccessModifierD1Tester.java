package com.syntaxBatch11Class16;

public class AccessModifierD1Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifierD1 am=new AccessModifierD1();
		
		am.name="kazim";//cannot access to the name because we created the name as private. 
		am.age=26;
		am.salary=120000;
		am.displayName();
		am.displayAge();
		am.displaySalary();
		
	}

}
