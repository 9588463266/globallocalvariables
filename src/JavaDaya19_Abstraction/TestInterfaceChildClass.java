package JavaDaya19_Abstraction;

public class TestInterfaceChildClass implements InterfaceA,InterfaceB {

	public static void main(String[] args) {
		
		TestInterfaceChildClass c=new TestInterfaceChildClass();
		c.msg();
		
		

	}

	@Override
	public void msg() {
		 System.out.println("i am in a msg method");
	}

}
