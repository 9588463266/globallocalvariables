package JavaDay23_Set;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSet {

	public static void main(String[] args) {
		List li=new LinkedList();
		System.out.println(li);
		
		li.add(3);
		li.add('v');
		li.add("pp");
		
		System.out.println(li);
		System.out.println("===============");
		
		Iterator itr=li.iterator();
		while (itr.hasNext()) {
			Object o=itr.next();
			System.out.println(o);
		}
		
		System.out.println("===============");
	
              for(Object a:li) {
            	  System.out.println(a);
              }
	}
}
