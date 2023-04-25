package day_6;

public class FactorialProgramme {

	public static void main(String[] args) {
		
		int number=5;//5*4*3*2*1=120
		int fact=1;
		
		//factorial-->5=5*4*3*2*1=120
		
		for(int i=number;i>=1;i--)
		{
			
			fact=fact*i;      //fact=1*5=5, 5*4=20,20*3=60,60*2=120,120*1=120
			 
		}
			System.out.println(fact);
			
		}
		
		
		
		
	}


