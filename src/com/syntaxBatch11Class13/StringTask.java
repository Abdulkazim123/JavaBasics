package com.syntaxBatch11Class13;

public class StringTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String userName="Kazim";
		String password="km@12345";
		String confirmPass="km@12345";
		
		
		if(!(userName.isEmpty()|| password.isEmpty())) {
			if(password.length()>=8) {
				if(!password.contains(userName)) {
				if(password.equals(confirmPass)) {
					
					
					System.out.println("Your userName and password has been created");
				}else {
					System.out.println("Passwor do not match");
				}
					
					
				}else {
			System.out.println("password cannot contain usserName");
			
				}
				
			}else {
				System.out.println("password is too shart");
			}
			
		
			}else {
				System.out.println("userName and passsword canot be empty");
			}
			
		
	
	
	
}
}	

	



