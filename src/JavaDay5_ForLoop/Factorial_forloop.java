package JavaDay5_ForLoop;

public class Factorial_forloop {
        
	public static void main(String[] args) {
		
		 int number = 5;
		 
		 int fact=1;
		 
		 for(int i=number; i>=1; i--) 
		   {
			 fact = fact*i; // 1*5=5, 5*4=20, 20*3=60, 60*2=120, 120*1=120	
		   }
		 System.out.println(fact);
	}
		
		
}
