package JavaDay6_Method;

public class ReverseNumber1 {

	public static void main(String[] args) {
		
		int input=543;
		int output=0;  //345
		
		while(input>0) {   //54>0=t 54>0=t 5>0=t
			
		int reminder=input%10;//3 54%10=4 5%10=5
		input=input/10;   //543/10=54 54/10=5 5/10=0
		output=output*10+reminder; //0*10+3=3 3*10+4=34 34*10+5=340+5=345
		
		}
         System.out.println(output);
	}

}
