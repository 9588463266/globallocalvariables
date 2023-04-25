package day_5Looping;

public class NestedForLoop {

	public static void main(String[] args)
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	
	}
		
		
		/*String s="myname";
		String reverstring="";

		for(int i=s.length()-1;i>=0;i--)
		{

		reverstring = reverstring + s.charAt(i);

		}

		System.out.println(reverstring);

		if(s.equals(reverstring))
		{
		System.out.println("string is palindrome");
		}

		else
		{
		System.out.println("string is not palindrome");

     }
		}*/
		
		/*int n=12345;
		int rev=0;
		
		while (n!=0)
		{
			int r =n%10;
			n=n/10;
			rev = rev*10+r;
		}
		System.out.println("Reverse:"+rev);
		
	}*/
}
