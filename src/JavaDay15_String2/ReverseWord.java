package JavaDay15_String2;

public class ReverseWord {

	public static void main(String[] args) {
		
		String input =" my name is ram ";
		//expected ans=ram is name my
		String output="";
		String a[]=input.split(" ");
		
		for(int i=a.length-1;i>=0;i--) {
			
			output=output+a[i]+" ";
			
		}
	    System.out.println(output);
		
	}

}
