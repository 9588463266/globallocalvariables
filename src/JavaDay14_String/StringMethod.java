package JavaDay14_String;

public class StringMethod {

	public static void main(String[] args) {
		
		String s="myname";	
		String s1="MYNAME";
		
		String Emptystring="";
		String Blankstring=" ";
		
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("====================");
		
		System.out.println(Emptystring.isEmpty());
		System.out.println(Emptystring.isEmpty());
		System.out.println(Blankstring.isEmpty());
		System.out.println(Emptystring.isEmpty());
		System.out.println("====================");
		System.out.println(s.concat("nitin"));
		System.out.println("====================");
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println((s.length()-1));
		System.out.println("====================");
		
		System.out.println(s.startsWith("myn"));
		System.out.println(s.endsWith("ame"));
		System.out.println(s.contains("nm"));
		
		
		
		
		
		
		
	
	
	
	}

}
