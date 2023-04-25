package JavaDay8_Static;

import java.util.Scanner;

//import java.util.Scanner;

public class PrimeNumber{
	
	public static void main(String[] args) {
		
		  /*Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number:");
		 int number=sc.nextInt();*/
		
		   int number=4;    //1,2,3,5,7,11,,13,15
		   boolean flag=false;
		  /*if ((number==0) || (number==1))
		  {
			  System.out.println(" number is not a prime number ");
			
		  }
		  else 
		  {*/
		    for (int i=2;i<=number/2;i++) 
		    {
			if (number%	i==0) 
			flag=true;
			break;    
		   }
		  
		if (flag==false)
		{
		System.out.println(" number is prime number");
		}
		else 
	     {
		  System.out.println("number is not prime number");
	    }
	}
	
}
	
