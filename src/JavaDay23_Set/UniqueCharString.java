package JavaDay23_Set;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharString {

	public static void main(String[] args) {
		String input="testers";
		Set output= new HashSet();
		
		for(int i=0;i<input.length();i++) {
			output.add(input.charAt(i));
			
		}
		System.out.println(output);
	}

}
