package JavaDay22_ArrayList;

public class RecursiveMethodProgFactorial {
	
	/*static int factorial (int n) {
	  if(n==1)
      return 1;
	  else 
		  return (n*factorial (n-1));
	}
   public static void main (String args[]) {
	   System.out.println("factorial of is:  "+factorial (3));
   }*/
	
   
   static int factorial (int n) {
	   
	   if(n==1)
	   
		   return 1;
	   
		   else
		
			 return (n*factorial(n-1));  
		   }
	   public static void main (String args[]) {
		   
		   System.out.println("factoral of:"+factorial(5));
	   }
}




