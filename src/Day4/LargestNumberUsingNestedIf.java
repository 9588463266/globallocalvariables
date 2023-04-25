package Day4;

public class LargestNumberUsingNestedIf {

	public static void main(String[] args) {
		
		int a=200,b=300,c=100;
		
		if (a>b)
		{
			if(a>c)
			{
				System.out.println("a is largest:"+a);
				}
			else 
			{
				System.out.println("c is largest:"+c);
			}
		}
		else if (b>c)
		{
			System.out.println("b is largest:"+b);
		}
		else 
		{
		System.out.println("c is largest:"+c);
		}
		
		
		
		
		
		

	}

}
