package JavaDay24_Map;

import java.util.HashMap;
import java.util.Map;

public class CharCountOfString {

	public static void main(String[] args) {
		String input ="testers";
		
		Map <Character,Integer>map=new HashMap();
		
		for(int i=0;i<input.length();i++) {
		char c=input.charAt(i);
	
		if (map.containsKey(c)) {
			map.put(c, (map.get(c)+1));		
		}else {
			map.put(c, 1);
		
	}

	}
		System.out.println(map);
}
}