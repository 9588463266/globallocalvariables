package Day7;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[]= {50,40,30,20,10};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		 System.out.println(Arrays.toString(a));
		 
		 
		 int num=10;
		 boolean flag =false;
		 for(int i=0;i<=a.length-1;i++)
		  {
			 if(a[i]==num)
			   {
				 System.out.println("element found");
				 flag=true;
				 break;
			   }
		 }
		 
		 if(flag==false)
		 {
		System.out.println("element not found");
		 }
		
	
	}
	
}