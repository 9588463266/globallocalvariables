package Day7;

public class ReverseStringDemo {

	public static void main(String[] args) {
		
		String s= "welcome 123";
		
		
		char a[]=s.toCharArray();//char a[]=welcome
		System.out.println(a);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
		System.out.println();
	}
}
		
		/*String input ="my name is ram";
		
		String output="";
		
		String a[]=input.split(" "); //my name is ram
		System.out.println(input);
		
		
		for(int i=a.length-1;i>=0;i--) 
		   {
				output=output+a[i]+" ";
			}
		System.out.println(output);
	
	if(input==output)
	{
		System.out.println("String is palindrome");
	}
	else 
	{ 
		System.out.println("String is not palindrome");
		
	}
	
	}*/

	

