package JavaDay17_Inharitance;

public class StringMethod4 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		StringBuilder sd=new StringBuilder ("hi");
		sd.append("java");
		sb.append("java");
		System.out.println(sd);
		System.out.println(sb);
		System.out.println("============================");
		sb.reverse();
		sd.reverse();
		System.out.println(sb);
		System.out.println(sd);
		System.out.println("=====================");
		
		StringBuffer sb2=new StringBuffer("nitin");
		sb2.replace(1, 4, "java");
		
		System.out.println(sb2);
		
		System.out.println("===============");
		StringBuffer sb3=new StringBuffer("prasad");
		sb3.insert(1, "ni3");
		System.out.println(sb3);
		
		StringBuilder sd4=new StringBuilder ("mayur+");
		sd4.delete(1, 3);
		System.out.println(sd4);
		
	}

}
