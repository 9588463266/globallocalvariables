package JavaDay10_Array;

public class CheckEqualityOfArray 
{

	public static void main(String[] args) {
		
		
		int[]arrayone= {2,1,3,6};
		int[]arraytwo= {2,1,3,6};
		
		boolean flag=false;
		if(arrayone.length==arraytwo.length) 
		{
			for(int i=0;i<arrayone.length;i++) 
			{
			
			if(arrayone[i]!=arraytwo[i]) 
			{
			    flag=true;
				break;
			}
		}
	}
           if(flag==true)
           { 
          System.out.println("array are not equal");
	       } 
     else 
     {
		   System.out.println("array are equal");
		  }
	}
}
		
		
		
		/*int a[]= {2,1,3,6};
		int b[]= {2,4,3,5};
		
		//check array is equal or not 
		boolean status=false;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				status=true;
				break;
			}
			System.out.println("Array is equal");
		}
		
		
		if(status=true)
		{
			System.out.println("Array is equal");
		}
		else
		{
			System.out.println("Array is not equal");
		}
	}
}*/


	
