package JavaDay16_String3;

public class FindUniqueCharString {

	public static void main(String[] args) {
		/*String input="testers";                     //Expected fetch ans=tesr
		String output="";
		
		for(int i=0;i<input.length()-1;i++) 
		   { 
			char a=input.charAt(i);
			String c=Character.toString(a);
			if((output.contains(c)==false))
			{
			output=output+c;
		    }
	}

		
	   System.out.println(output);
}
}*/
		
		
		String s = "nitin";   // exe=nit
				
				String r="";
				
				for(int i=0;i<=4;i++)
				{
					char a=s.charAt(i);
					String c=Character.toString(a);
					if((r.contains(c)==false))
       {
	      r=r+c;
        }
				}
					System.out.println(r);
}

}
							
	
				


	   
	   