package Day7;

public class SearchingofElementsArray {

	public static void main(String[] args) {
		
		int a[]= {50,30,40,20,10};
		
		int num=10;
		
		/*boolean status=false;
		
		for (int i =0;i<a.length;i++)
			
		{
			if(a[i]==num)
			{
				System.out.println("element found");
				status=true;
				break;
			}
		}
		  if(status==false)
		{
		System.out.println("element not found");
		}
		
		
		// enhanced for loop or for each lopp */
		
		
		boolean status=false;
		 for(int x:a) 	
		   {
			 if(x==num)
		       {
				System.out.println("element found");
				status=true;
				break;
		       }
		
		}
		if(status==false)
		{
		System.out.println("element not found");
		}
		
	}

}
