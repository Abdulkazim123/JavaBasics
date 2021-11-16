package com.syntaxBatch11Class16;

public class Account {

	
	 private String userName;
	 private String password;
	 private String name;
	 private String address;
	 private int age;
	 private double accountBalance=10;
	 
	 public void setUserName(String acccountuserName) {
		 
		 if(acccountuserName.length()<16) {
		 userName=acccountuserName;

		 }else {
			 System.out.println("userName of this length is not allowed ");
			
			 
		 }
	 }
	 
	 public void setPassword(String accountPass) {
		 if(accountPass.length()<16) {
			 password=accountPass;
		 }else {
			 System.out.println("password of this length is not alloewed");
			 
		 }
	 
	 
	 }
	  public void getBalance(String accountuserName,String accountPassword) {
		 if(userName.equals(accountuserName)&&password.equals(accountPassword)) {
			 System.out.println(accountBalance);
			 
		 }else {
			 System.out.println("UserName or password is not coorect");
		 } 
	 }
}
