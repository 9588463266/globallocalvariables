package JavaDay15_String2;

public class ReverseEachOwnLocation {

	public static void main(String[] args) {

		String input =" my name is ram";      // ANS EXPECTED= ym eman si mar
		
		String output="";
		String[]strarray=input.split(" ");
		
		for (String s:strarray) {
		String revWord=reverse(s);
		output=output+revWord+" ";
		
	}
     System.out.println(output);
}

	public static String reverse(String word) {
		
		String revWord="";
		for(int i=word.length()-1;i>=0;i--) {
			revWord=revWord+word.charAt(i);
		}
		return revWord;
	}
}

	