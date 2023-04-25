package JavaDay15_String2;

public class StringMethod {

	public static void main(String[] args) {
		
		String s=" my name ";
		
		System.out.println(s);
		System.out.println(s.trim());
	
		char arr[]=s.toCharArray();
		System.out.println(s.toCharArray());
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		
		System.out.println("=====================");
		for(int i=0;i<=arr.length-1;i++) {
		//int i = 7;
		System.out.print(arr[i]);
		}
	
		System.out.println(arr[7]);
		System.out.println("=====================");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
		System.out.println("=====================");
		
	String fullname=" RAJ SAGAR PATIL";
	      String a[]= fullname.split(" ");
	      System.out.println(a[3]);
	      System.out.println(" "+a[3]+" "+a[2]+" "+a[1]+" "+a[0]);
	      
	      String n=" my name ";
	      System.out.println(n.indexOf('y'));
	      System.out.println(n.lastIndexOf('e'));
	      
	      System.out.println(n.substring(4));
	      System.out.println(n.substring(2, 5));
	     

	}
}
