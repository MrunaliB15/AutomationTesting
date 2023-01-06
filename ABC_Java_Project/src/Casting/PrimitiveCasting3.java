package Casting;

public class PrimitiveCasting3 {

	public static void main(String[] args) {
		byte b=34;
		short s=b;
		int i=b;
		long l=b;
		float f=b;
		double d=b;
		System.out.println("widening type cating.....");
		System.out.println("byte:"+b);
		System.out.println("byte to short: "+s);
		System.out.println("byte to int: "+i);
		System.out.println("byte to long: "+l);
		System.out.println("byte to float: "+f);
		System.out.println("byte to double: "+d);
		
		double d1=23.3d;
		float f1=(float)d1;
		long l1=(long)d1;
		int i1=(int)d1;
		short s1=(short)d1;
		byte b1=(byte)d1;
		System.out.println("************************************");
		System.out.println("narrowing type cating.....");
		System.out.println("double: "+d1);
		System.out.println("double to float: "+f1);
		System.out.println("double to long: "+l1);
		System.out.println("double to int: "+i1);
		System.out.println("double to short: "+s1);
		System.out.println("double to byte: "+b1);
	}

}
