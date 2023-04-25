package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{

	public static void main(String[] args) 
	{
		//ArrayList mylist= new ArrayList();
		List mylist=new ArrayList();
		
	 // List <Integer>mylist=new ArrayList<Integer>(); // homogeneous data 
		
		mylist.add(100);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		System.out.println(mylist);
		
		System.out.println(mylist.remove(4));
		System.out.println(mylist);
		System.out.println(mylist.size());

        System.out.println(mylist.get(1));
        
        //reading all collection
        
        for(Object x:mylist)
        {
        	System.out.println(x+"    ");
        }
     
	
	     System.out.println(mylist);
	     
	     System.out.println(mylist.remove(1));
	     mylist.add(2, "nitin");
	     System.out.println(mylist);
	     mylist.remove(2);
	     System.out.println(mylist);
	     System.out.println(mylist.contains('A'));
	     
	     System.out.println(mylist.isEmpty());	
	     
	     
	    /* String s="nitin";
	     
	     ArrayList list = new ArrayList();
	     
	     for(int i=0;i<s.length();i++)
	     {
	    	 char x=s.charAt(i);
	    	 if(list.contains(x)==false)	 
	    	 {	 
	     }
	     
	    	 System.out.println(x);
	    	 
	    	 
	    	 
*/
	}
}





