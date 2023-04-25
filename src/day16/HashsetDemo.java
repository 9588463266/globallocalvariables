package day16;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args)
	{
		//HashSet hs = new HashSet();
		
		Set hs = new HashSet();
		
		hs.add(100);
		hs.add("nitin");
		hs.add('A');
		hs.add(true);
		hs.add(100);
		hs.add(null);
		hs.add(null);
	    System.out.println(hs);
	    
	    hs.remove(100);
	    System.out.println(hs);
	    //hs.clear();
	    System.out.println(hs);
	    
	    System.out.println(hs.size());
	    
	    //reading one by one value 
	    
	    for(Object x:hs)
	    {
	    	System.out.println(x);
	    }
	    System.out.println(hs);
	   
	    
	    
	    
	    
	    
		

	}

}
