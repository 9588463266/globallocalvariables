package Day13;

public class WrapperClass {

	public static void main(String[] args) {
		
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		double d =10.5D;
		float f= 20.5f;
		char c='a';
		boolean bln=true;
		
		//autoboxing-conv premitive to object
		
		Byte byteobj=b;
	
		Short srtobj=s;
		Integer iobj=i;
		Long lobj=l;
		Double dobj=d;
		Float fobj=f;
		Character cobj=c;
		Boolean blnobj=bln;
		
		System.out.println(byteobj);
		System.out.println(srtobj);
		System.out.println(iobj);
		System.out.println(lobj);
		System.out.println(dobj);
		System.out.println(fobj);
		System.out.println(cobj);
		System.out.println(blnobj);
		
		System.out.println("-------------------");
		
		//unboxing-obj to primitive
		byte bytevalue=byteobj;
		short shortvalue=srtobj;
		long longvalue=iobj;
		
		
		System.out.println(bytevalue);
		System.out.println(shortvalue);
		System.out.println(longvalue);
		
		
		

	}

}
