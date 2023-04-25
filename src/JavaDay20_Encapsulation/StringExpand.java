package JavaDay20_Encapsulation;

public class StringExpand {

	public static void main(String[] args) {
		String input="3a2b1c";            //int valu 0,2,4          //expected ans=aaabbc
		String output="";
		
		for(int i=0;i<input.length(); i=i+2) {
		char num=input.charAt(i);
		int number=Character.getNumericValue(num);
		
		for (int j=1;j<=number;j++) {
			output=output+input.charAt(i+1);
			
		}
	}
      System.out.println(output);
      
	}
}
