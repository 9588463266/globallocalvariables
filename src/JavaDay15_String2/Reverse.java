package JavaDay15_String2;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		
		/*String input =" my name is ram ";
		String output="";
		
		String[]Strarray=input.split(" ");
		
		for(int i =Strarray.length-1;i>=0;i--) {
			
			output= output+Strarray[i]+" ";
			
		}
		System.out.println(output);*/
		
		/*String s = " my name is ram";
		
		String r = "";
		
		String strarray []=s.split(" ");
		
		for(int i=strarray.length-1;i>=0;i--)
		{
			r=r+strarray[i]+"  ";
		}
		
		System.out.print(r);
		*/
		
		
		String s= " patil bapu nitin  ";
		
		
		String r="";
		
		String a[]=s.split(" ");
        
		for (int i=a.length-1;i>=0;i--)
			
		{
			String revWord=reverse(s);
			r=r+revWord;
		}
					
			System.out.println(r);
			
	}
			
			public static String reverse(String word)
			{
					String revWord="";
				for(int i=word.length()-1;i>=0;i--) 
				{
					revWord=revWord+word.charAt(i);
				}
				return revWord;
			}
	}





