package JavaDay11_MultiDimensionalArray;

public class Demo2 {

	public static void main(String[] args) {
		
		
		int x [][]= new int[3][2];  //row-3,column-2
		
		System.out.println(x[1][1]);  ///defalut value of int is 0
		
		x[1][1]=10;
		
		System.out.println(x[1][1]);
		
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9,10}};
		System.out.println(a.length);
            System.out.print(a[0].length);
            System.out.print(a[2].length);
            System.out.print(a[1].length);
	}

}
