package Class15Homework;

public class StudentsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Students  student1=new Students();
		
		  student1.studentname="Kazim";
		  student1.studentID=123;
		  Students.NumberOfStudents ++;
		
		 
		  System.out.println();
		   Students  student2=new Students();
		   student2.studentname="Mike";
		   student2.studentID=124;
		   student2.NumberOfStudents ++;
		 
		  
		
		   System.out.println();
			 Students  student3=new Students();
			 student3.studentname="Peter";
		     student3.studentID=125;
			 student3.NumberOfStudents ++; 
		
				 
				  
				 
				 //System.out.println("___________________");
				 
				 
				 
			 
		System.out.println("The total numbre of student in this class is " +Students.NumberOfStudents);
	}

}
