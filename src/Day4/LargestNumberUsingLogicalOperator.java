package Day4;

public class LargestNumberUsingLogicalOperator {

	public static void main(String[] args) {
		
		int a=20,b=2000,c=30;
		
		if (a>b && a>c)
		{
			System.out.println("a is largest number:"+a);
			
		}
		else if (b>a && b>c)
			
		{
			System.out.println("b is largest number:"+b);
		}
		else 
		{
			System.out.println("c is lagest number:"+c);
		}
		
	}

}
