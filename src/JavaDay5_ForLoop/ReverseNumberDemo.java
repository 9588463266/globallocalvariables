package JavaDay5_ForLoop;

public class ReverseNumberDemo {

	public static void main(String[] args) {
		int input=123;
		int output=0;
		
		int temp=input;
		while(input>0)
		{
			int rem=input%10;
			input=input/10;
			output=output*10+rem;
		}
		System.out.println(output);
	/*}
	
		if(temp=output)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("non palindrome");*/
		}

	}

