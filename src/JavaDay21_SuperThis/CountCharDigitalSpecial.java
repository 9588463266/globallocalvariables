package JavaDay21_SuperThis;

public class CountCharDigitalSpecial {

	public static void main(String[] args) {
		
		String input="ab$%1ac";
		int alphabet=0;
		String Allaphabet="";
		int digit=0;
		String Alldigit="";
		int SpecialChar=0;
		String AllSpecialChar="";
		
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			
			if(Character.isAlphabetic(c)) {
			alphabet=alphabet+1;
			Allaphabet=Allaphabet+c;
		}else if (Character.isDigit(c)){
			digit=digit+1;
			Alldigit=Alldigit+c;
		}else {
			 SpecialChar= SpecialChar+1;
			 AllSpecialChar=AllSpecialChar+c;
			
		}
					
		}
        System.out.println("Count Of Alphabet:  "+alphabet+"  list:  "+Allaphabet);
        System.out.println("Count Of Alphabet:  "+digit+"  list:  "+Alldigit);
        System.out.println("Count Of Alphabet:  "+SpecialChar+"  list:  "+AllSpecialChar);
	}

}
