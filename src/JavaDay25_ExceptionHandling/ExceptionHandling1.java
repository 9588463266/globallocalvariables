package JavaDay25_ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		//System.out.println(a/b);
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
		}
		System.out.println("divide by zero not possible");
		System.out.println("hello");
		System.out.println("HI");
	}

}
