package JavaDay8_Static;

public class FibonacciSeriesEx2 {

	public static void main(String[] args) {
		// 3 3
		
		
		
		int n1 =3;
		int n2=3;
		int n3=0;
		System.out.print(n1+ " "+ n2+ " " );
		
		for (int i = 3; i<=5; i++) {
			
			n3=n1+n2;
			
			System.out.print(" "+n3+" ");
			
			n1=n2;
			n2=n3;
					
		}
		
		
		
	}

}
