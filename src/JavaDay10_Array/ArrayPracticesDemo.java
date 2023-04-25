package JavaDay10_Array;

public class ArrayPracticesDemo {
	

	public static void main(String[] args) 
	{
		
		/*int a[]= {1,2,3,4,5};
		
		//System.out.println(a.length);
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		
		
		System.out.println("---------------------------");
		
		
		int b[][]= {{1,2,3},{4,5,6},{7,8,9,10}};
		
		System.out.println(b.length);
		
		System.out.println(b[1].length);
		System.out.println(b[0].length);
		System.out.println(b[2].length);
		System.out.println("...............");
		
		for(int i=0;i<=b.length-1;i++)//
		{
			for(int j=0;j<=a[i];j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	System.out.println("-------------------------------------");*/

		int c[]= {1,2,3,4,5};
		int d[]= {1,2,3,4,5};
		
		boolean flag=false;
		if(c.length ==d.length)	
					{
			for(int i=0;i<=c.length;i++)
			{
				if(c[i]!=d[i])
				{
						flag=true;
						break;
					}
			}
	}
			
				if(flag==true)
				
					{
						System.out.println("Arrays are not equal");
					}
				else
				{
					System.out.println("Arrays are equal");
				}
			}
}	
		/*int c[]= {1,2,3,4,5};
		int d[]= {1,2,3,4,5};
		
		boolean flag = false;
		if(c.length==d.length)
		{
			System.out.println("Arrays are equal");
		}
			for (int i=0;i<=c.length;i++)
			{
				if(c.length !=d.length)
				{
					flag=true;
					break;
				}
			}
			
		if (flag==false)
		{
			System.out.println("Arrays are not equal");
		}
		else
		{
			System.out.println("Arrays are equal");
		}
	}
	
	}*/

			
		
				
	
