package JavaDay5_ForLoop;

public class SwappingOfTwoVariablesWithoutThirdNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Befor swapping valu of a is:"+a);
		System.out.println("Before swaping valu of b is:"+b);
		
		System.out.println("-------------------------------");
		
		a=a+b;//10+20=30
		b=a-b; //30-20=10
		a=a-b;// 30-10=20
		
		System.out.println("After swapping value a is:"+a);
		System.out.println("After swapping value a is:"+b);
				
		
		

	}

}
