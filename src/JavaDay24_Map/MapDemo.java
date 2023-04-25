package JavaDay24_Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	  Map map=new HashMap();
	  
	  map.put(1, 10);
	  map.put(3, 21);
	  map.put("name", "test");
	  map.put(3,55);
	  map.put(4, 55);
	  
    System.out.println(map);
    
    System.out.println(map.containsKey(1));    //check key is present in map or not
	System.out.println(map.containsValue(22));   //check value is present in ,map or not
	System.out.println(map.get(1));     // fetch value of particular key 
	System.out.println(map.isEmpty());    //check map is empty or not 
	
	System.out.println(map.keySet());   //fetch all key in map
	System.out.println(map.values());  //fetch all value in map
	System.out.println(map.size());    // map length 
	map.remove(1);
	System.out.println(map);    // it is use to delete any element using key
	map.replace(3, 77);        // use to replace using key
	System.out.println(map);
	map.putIfAbsent(3, 88);     //if key not in map than update  
	System.out.println(map);
	 
	
	  
	

	}

}
