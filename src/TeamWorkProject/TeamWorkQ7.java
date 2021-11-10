package TeamWorkProject;



public class TeamWorkQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//rite a java program to check whether a given number is prime or not?
		 
		int num=17;
				
	boolean isPrime = true;
			
		if(num>1) {
			
			
		
				
				for (int i = 2; i <= num ; i++) {
		
					
					if (num == 0) {
						
						isPrime = false;
						break;
						
						
					}
				}
				
	}else {	
				
			 isPrime = false;
			
	}
	          
	if(isPrime) {
	
					
					System.out.println(num + " is a Prime Number");
					
				
					
					
				}else {
					System.out.println(num + " is not a Prime Number"); 
				} 
				
			}

		
	

}
