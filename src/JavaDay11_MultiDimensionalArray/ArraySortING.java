package JavaDay11_MultiDimensionalArray;

import java.util.Arrays;

public class ArraySortING {

	public static void main(String[] args) {
		
		int [] a= {78,34,1,3,90,-1,-4,6,55,20,-65};
		
		/*for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				int temp=0;
			
				if(a[i]>a[j]) {
				                                    
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				 
          //System.out.println(a[i]);
	}
		
			
			}
			System.out.print(a[i]+" ");*/
		
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));

}
	}
