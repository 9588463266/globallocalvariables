package JavaDay20_Encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		EncapsulationDemo e=new EncapsulationDemo();
		
		e.setSalary(50000.0f);
		e.setName("pooja");
		
		System.out.println("pooja");
		float f=e.getSalary();
		System.out.println(f);
	}
	
	
	

}
