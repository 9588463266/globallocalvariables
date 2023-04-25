package JavaDay23_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TypeOfSet {

	public static void main(String[] args) {
		
		Set hs=new HashSet();           // not maintain insertion order
		hs.add("cc");
		hs.add('d');
		hs.add('a');
		hs.add('c');
	
		System.out.println(hs);
		
		Set lhs=new LinkedHashSet();             //Maintaine insertion order 
		lhs.add("cc");
		lhs.add('d');
		lhs.add('a');
		lhs.add('c');
	
		System.out.println(lhs);
		
		Set ts=new TreeSet();            // mantain element in sorted formate--asc to desc
		//ts.add("cc");
		ts.add('d');
		ts.add('a');
		ts.add('c');
		
		System.out.println(ts);

	}

}
