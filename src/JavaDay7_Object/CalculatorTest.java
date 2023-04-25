package JavaDay7_Object;

public class CalculatorTest {

	public static void main(String[] args) {
		
       System.out.println(addition (10,10));
       System.out.println(average (15,15));
       System.out.println(verifyage (20, 0));
       System.out.println(substraction (20, 15));
	}
     public static int addition (int a,int b) {
		int c=a+b;
		return c;
		
	}
	public static int average(int c,int d) {
	int average=(c+d)/2;
	return average;
	
	}
	public static Boolean verifyage(int a,int b) {
		if(a>18) {
		  return true;
	}else {
		return false;
	}
	}
	public static int substraction(int a,int b) {
		int substraction=a-b;
		return substraction;
		}

	}