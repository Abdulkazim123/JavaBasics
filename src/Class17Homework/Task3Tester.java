package Class17Homework;

public class Task3Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       // new Task3(); not possible as it is private, and we are at the sane package
		//also if we create a class outside of this package we will not access to default 
		new Task3("name");
		
		new Task3( 10);
		new Task3(45.2);
		
	}

}
