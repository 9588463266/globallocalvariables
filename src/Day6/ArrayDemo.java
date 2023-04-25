package Day6;

public class ArrayDemo {

	public static void main(String[] args) {
		// 1d Array
		
		/*// 1st aproach
		int a[]=new int [5];  // declaration 
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		// 2 nd aproach
		
		int a[]= {100,200,300,400,500};
		
		
		/*System.out.println(a.length);
		
		System.out.println(a[0]);
		System.out.println(a[3]);
		
		
		for (int i =0;i<a.length;i++)
		{
			System.out.print(a[i]+  "  ");
			
		}
		System.out.println();*/
		
		for(int i:a)
		{
			System.out.print(i+ "   ");
		}
         System.out.println();
	}

}

