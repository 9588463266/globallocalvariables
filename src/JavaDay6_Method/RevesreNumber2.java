package JavaDay6_Method;

public class RevesreNumber2 {

	public static void main(String[] args) {
		
		int input=6789;
		int output=0;
		
		while(input>0) {   //6789>0 t,678>0 t 67>0 t 6>0 t
		
		int reminder=input%10; //9 678%10=8 67%10=7 6%10=6
		input=input/10;  //678 67 6 6
		output=output*10+reminder;   //0*10+9=9,9*10+8=98 98*10+6=986 986*10+1=987 9876
		
		
	}
	  System.out.println(output);
	}
}
