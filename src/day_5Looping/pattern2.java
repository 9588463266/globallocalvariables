package day_5Looping;

public class pattern2 {

	public static void main(String[] args) 
	{

		int a=5;
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	
	}

}
