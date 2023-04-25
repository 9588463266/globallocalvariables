package day16;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		//HashMap hm=new HashMap();
		
		Map hm = new HashMap();
		
		//Map <Integer,String>hm = new <Integer,String>HashMap();
		
		hm.put(101, "Nitin");
		hm.put(102, "Mayuri");
		hm.put(103, "pranav");
	    hm.put(104, 'M');
	    hm.put(105, true);
	    hm.put(106, 100);
	    hm.remove(101);
	    System.out.println(hm);
	   System.out.println(hm.get(102));
	   
	   System.out.println(hm.keySet());
	   
	   System.out.println(hm.get(103));
	   
	  /* for(Object x:hm.keySet())
	   {
		System.out.println(hm.get(x));
	   }*/
		
	for(Object k:hm.keySet())
	{
		System.out.println(k+"     " +hm.get(k));
	}
		
		
		
		
		
		
		
		
	}

}
