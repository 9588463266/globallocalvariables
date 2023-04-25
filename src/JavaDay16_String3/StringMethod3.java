package JavaDay16_String3;

public class StringMethod3 {

	public static void main(String[] args) {
		
		String s1="name";
		String s2="name";
		String s3=new String("name");
		String s4="Name";
		String s5="test";
		//.equals method-check content of string is equals or not which also include casing.
		System.out.println(s1.equals(s2));  //t
		System.out.println(s1.equals(s3));  //  f
		System.out.println(s1.equals(s4));  //f
		System.out.println(s1.equals(s5));  //f
		System.out.println(s2.equals(s1));  //f
		System.out.println("===================================");
		//== operator-check the reference memory along with content is same or not 
		System.out.println(s1==s2);  //t
		System.out.println(s1==s3);  ////f 
		System.out.println(s1==s4);   //f
		System.out.println(s1==s5);  //f
		
		//compare To-Check the string dictionary wise 
		String a1="abc";
		String a2="aabc";
		String a3="xyz";
		String a4=" abc";
		String a5="ABC";
		System.out.println("===================================");
		System.out.println(a1.compareTo(a2));  // 2-1=1
		System.out.println(a1.compareTo(a3));  //
		System.out.println(a1.compareTo(a4));
		System.out.println(a1.compareTo(a5));
		

		

	}

}
