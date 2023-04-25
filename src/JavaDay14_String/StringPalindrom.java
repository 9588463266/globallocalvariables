package JavaDay14_String;

public class StringPalindrom {

	public static void main(String[] args) {
		
		 String s="myname";
		
	     String reversestring = "";
     
		for(int i=s.length()-1;i>=0;i--) 
		{
			
			reversestring=reversestring+s.charAt(i);
		}
			
			System.out.println(reversestring);
		
	       if(s.equals(reversestring)) {
	        System.out.println("string is palindrome");
           }
           else
            {
        	   System.out.println("string is not palindrome");
        	}
	
	
			
			
			
			String input="my name is nitin";
	
			String output = "";
			
			String a[]=input.split(" ");
			
			System.out.println(input); // my name is nitin 
			
			for(int i=a.length-1;i>=0;i--)
			{
				output=output+a[i]+" ";
			}
			System.out.println(output);
			
					
					
					
					
					
					
					
			
    			
	}
	}


