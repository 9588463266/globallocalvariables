package JavaDay21_SuperThis;

public class Child extends  Parent{
	int x=20;
	
	Child(){
		System.out.println("i am in child class constructor");
	}
	
	
	public void m1() {
		System.out.println("i am in child class m1 method");
	}
     public void display () {
    	 System.out.println(x);
    	 m1();
     
	   System.out.println("================");
	   
	   System.out.println(super.x);
	   super.m1();
	   
	   System.out.println("======================");
	   
	   System.out.println(this.x);
	   this.m1();
     }

	   
	   public static void main (String args[]) {   
		   Child c=new Child();
		   c.display();
		  
}
}
   