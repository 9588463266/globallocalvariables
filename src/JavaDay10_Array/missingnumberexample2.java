package JavaDay10_Array;

public class missingnumberexample2 {

	public static void main(String[] args) {
		
		
		int input []= {10,20,30,50};   //10,20,30,40,50
		
		int arrayaddition=0;
		for(int i=0;i<input.length;i++) {
		arrayaddition=arrayaddition+input[i];
		
		}
		System.out.println(arrayaddition);
	
		
		int addition=0;
		for(int j=10;j>5;j--) {//10<=50 t
			addition=addition+j;//0=0+50=50
		}
       System.out.println(addition);
  

     System.out.println(arrayaddition-addition);
     
}

     



	
	
}

   
