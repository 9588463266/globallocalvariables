package JavaDay8_Static;

public class FibonnaciSeries {

	public static void main(String[] args) {
	// 1  1
		
		int n1=1;
		int n2=1;   
		int n3=0;
		
        
		System.out.print(n1+ " " + n2+ " " );
		
		for ( int i=3; i<=10;i++)   //4<=10 
		{
				
		n3=n1+n2;    //1+1=2  5  
		
		System.out.print(" " + n3+ " ");
		
			n1=n2;
			n2=n3;
			
		
	}

	}
}
