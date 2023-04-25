package JavaDay7_Object;

//import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	
		//Scanner sc=new Scanner(System.in);
		 //System.out.println("enter a number:");
		 //int year=sc.nextInt();
		 
		 int year=1998;
	if(((year%4==0)&&(year%100!=0)||(year%400==0))){
		
		System.out.println("year is leap year:");
		
	}else {
		
		System.out.println("year is not leap year:");
	}
	}
}

	


