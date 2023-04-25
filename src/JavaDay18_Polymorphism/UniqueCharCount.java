package JavaDay18_Polymorphism;

public class UniqueCharCount {

	private static String counter;

	public static void main(String[] args) {
		String input="testers";
		String output="";
		
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			String x=Character.toString(c);
			
			if((output.contains(x)==false)) {
				output=output+x;
			}
		
         System.out.println(output);
		}
	
	
      //input 7 testers  output tesr 4

       for (int p=0;p<output.length();p++){
          char n=output.charAt(p);
          String a=Character.toString(n);
       
          int counter=0;
          
          for(int q=0;q<input.length();q++) {
        	  char m=input.charAt(q);
        	  String b=Character.toString(m);
        	  
           if(a.equals(b)) {
        		  counter++;
        	  }
          }
	
       
          System.out.println("count of " + "a"+" is: "+counter); 
       }
	}
}
    	   
       