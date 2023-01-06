package Inheritance;

class A1 {
	static int a= 23;
	int b= 15;
	double c= 12.2;
}
class B1 extends A1 {
	static int x= 13;
	int y=24;
	double z= 32.2;
}
class C1 extends B1 {
	static int m= 34;
	int n= 25;
	double o= 43.3;
}

public class Inheritance1 {

	public static void main(String[] args) {
		//access static member of class A,B and C
		System.out.println("class A1 static variable ="+A1.a);
		System.out.println("**************");
		System.out.println("class B1 static variable ="+B1.x);
		System.out.println("***************");
		System.out.println("class C1 static variable ="+C1.m);
		//Access non static member of A,B and C
		C1 c=new C1();
		System.out.println("class C1 reffer= "+c.b );
		System.out.println("class C1 reffer ="+c.c);
		System.out.println("class C1 reffer ="+c.y);
		System.out.println("class C1 reffer ="+c.z);
		System.out.println("class C1 reffer ="+c.n);
		System.out.println("class C1 reffer ="+c.o);
		System.out.println("**********************");
		B1 b=new B1();
		System.out.println("class B1 reffer ="+b.b);
		System.out.println("class B1 reffer ="+b.c);
		System.out.println("class B1 reffer ="+b.y);
		System.out.println("class B1 reffer ="+b.z);
	}

}
