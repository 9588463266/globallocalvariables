package JavaDay10_Array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
     int a[]=new int[5];    //declaration,instantiation(size asign)
     
         a[0]=1;
         a[1]=2;
         a[2]=3;
         a[3]=4;            //initialization(value asign)
         a[4]=5;
         
         int b[]=new int[2];
         b[0]=10;
         b[1]=15;
         
         System.out.println(a[1]);
         System.out.println(a[3]);
         
         System.out.println(b[0]);
         
      // When we do not have any value for array index, then java put the default
 		// value of datatype
 		System.out.println(b[1]); // default value of int is 0
 		
 		boolean c[] = new boolean[2]; // default value of boolean is false
 		
 		
 		System.out.println(c[0]);
 

         
         
         
         
     
			

	}

}
