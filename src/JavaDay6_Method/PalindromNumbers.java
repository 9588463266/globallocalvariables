package JavaDay6_Method;

public class PalindromNumbers {

	public static void main(String[] args) {
		
		int input=121;
		int temp=input;
		int output=0;
		
	
		while(input>0) 
		{
		 int reminder=input%10;
		 input=input/10;
		 output=output*10+reminder;
		
		if(temp==output)
		{
			System.out.println("Number is palindrome");
		}
		else 
		  {
			System.out.println("Number is not palindrome");
		  }
		
		
		
		}
		
		
		

	}

}
