package JavaDaya19_Abstraction;

public class Test2 {

	public static void main(String[] args) {

		InterfaceChildDemo c=new InterfaceChildDemo();
		
		c.m1();
		c.m2();
		
		InterfaceDemo d =new InterfaceChildDemo();
		
		c.m1();
		c.m2();
	}

}
