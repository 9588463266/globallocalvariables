package JavaDay14_String;

public class ReverseString {

	public static void main(String[] args)
	{
		
		/*String s="myname";
		
	     String reversestring = "";
      
		for(int i=s.length()-1;i>=0;i--) 
		{
			
			reversestring=reversestring+s.charAt(i);
		}
			
			System.out.println(reversestring);
		
	}
}*/
	
		
		/*String s= "mayuri";
		
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			r=r+s.charAt(i);
		}
		
		System.out.println(r);
		
		}
}*/
		
		
		
		
		String s="mayuri";
		
		char a[]=s.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
			
		{
			System.out.print(a[i]);
		}
		
		}
	}



