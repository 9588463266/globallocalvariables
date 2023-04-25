package JavaDay15_String2;

public class StringIsImutable {

	public static void main(String[] args) {
		
		String s="abc";
		
		System.out.println(s);
		System.out.println(s.concat("xyz"));
		
		System.out.println(s);
		
		String x=new String ("pqr");
		
		StringBuilder sb=new StringBuilder("pqr");
		
		x.concat("pqr");
	    sb.append("pqr");
	
	System.out.println(x);
	System.out.println(sb);
	System.out.println("=========================");
	
	
	StringBuffer bf=new StringBuffer ("lmn");
	
	bf.append("lmn");
	
	System.out.println(bf);
	}

}
