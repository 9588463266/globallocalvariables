package Day4;

public class IfElseCondition {

	public static void main(String[] args) {
		
		
	   int person_age=20;
				
		/*if(person_age>=18)
		{
			System.out.println("person is eligible for vote");
			
		}
		else 
		{
			System.out.println("person is not eligible for vote");
		}*/
		
		
		
		//using ternary operator
		
		System.out.println(person_age>=18 ? " ELIGIBLE FOR VOTE ":" NOT ELIGIBLE FOR VOTE ");
	}

}
