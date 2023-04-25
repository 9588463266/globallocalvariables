package Day4;

public class EvenNumber {

	public static void main(String[] args) {
		
		int number = 0 ;
		
		if (number%2==0)
		   {
			System.out.println("even number");
		   }
		else
		   {
			System.out.println("odd number");
		   }
		
	//using ternary operator
		
		
		//System.out.println(number%2==0 ? "even number": "odd number");
		
		//print even number 1..10 (2,4,6,8,10)*/
		
		
	    for (int i=1;i<=10;i++)
	    {
	    	if(i%2==0)
	    	{
	    		System.out.print(i+" ");
	    	}
	    	
	    }
	    System.out.println();
	}
}

