package JavaDay22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//List li=new list(); we can not create object of interface
         List al=new ArrayList();                    //parent c=new child 
		ArrayList ali=new ArrayList();     //child c=new child
		System.out.println(al);
		
		al.add(1);
		al.add('c');
		al.add(true);
		al.add("test");
		
		System.out.println(al);
		System.out.println(al.get(2));           //get method is use to fetch value from particular index
		System.out.println(al.size());         //size method is use to fetch length of collection
		System.out.println(al.isEmpty());       // check collection is empty or not
		//al.clear();                              // clear means remove all the elements from collection
		//System.out.println(al);
		System.out.println(al.contains(2));     //contains element check passed element is present in collection or not
		System.out.println("=======================");
		al.add(0, "mantri");
		System.out.println(al);
		ali.add(3);
		ali.add(2);
		System.out.println(ali);
		al.addAll(ali);                      //use to add one collection into another
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.set(2, 2);                      //it is use to update a value on particular index
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		
	}
}
		


