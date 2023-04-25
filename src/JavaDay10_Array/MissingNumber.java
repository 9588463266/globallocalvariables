package JavaDay10_Array;

public class MissingNumber {

	public static void main(String[] args) {
		
		//1,2,3,4,5-expected 
		int input[] = {1,2,3,5};
		int arrayaddition=0;
		for (int i=0;i<input.length;i++) {
		arrayaddition=arrayaddition+input[i];
		}
		System.out.println(arrayaddition);//11
		
		int addition=0;
		for(int j=1; j<=5;j++) {
		addition=addition+j;
	}
		System.out.println(addition);//15
		
		System.out.println(addition-arrayaddition);// missing number=4
	
		//15-11=4
				
		
		
		
		
	}

}
