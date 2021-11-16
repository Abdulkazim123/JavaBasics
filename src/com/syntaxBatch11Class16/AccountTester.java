package com.syntaxBatch11Class16;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1=new Account();
		//account1.balance=123456789//not allowed because 
		
		account1.setUserName("kazim");
		account1.setPassword("pass123");
		account1.getBalance("kazim", "pass123");
  
	}

}
