package java_Day4_;

public final class Iflelseif {

	public static void main(String[] args) {
		
		int a=30;
		int b=50;
		int c=10;
		
	if(a>b&&a>c) {      //f&&f=f
		
	System.out.println("a is highest");
	
	
	}else if (b>a&&b>c) {     //t&&f=f
	
	System.out.println("b is highest");
	
	}else{               //c print
		
	System.out.println("c is highest");
	}

	}

}
