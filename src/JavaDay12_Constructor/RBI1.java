package JavaDay12_Constructor;

public class RBI1 {

	      int r;                           //global variable or class variable 
	     RBI1( int rate){
		   r=rate;                         //class or global varible =local varible
	     }
		public int calculateinterest(int p,int t){
			int interest=p*r*t/100;
			return interest;              // p=100
					                  //      t=1,r=7    
			
	}

}
