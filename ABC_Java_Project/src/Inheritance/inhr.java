package Inheritance;

class A {
	 static int a= 10;
	 int b= 15;
	 double c=23.7;
}
class B {
	 static int p= 13;
	 int q= 24;
	 double r= 13.34;
}
class C {
	static int x=23;
	int  y= 34;
	double z= 34.5;
}
   public class inhr {
	 public static void main(String[] args) {
		//Access the static member of class A,B and C
		System.out.println("class A static member ="+A.a);
		System.out.println("**********************");
		System.out.println("class B static member ="+B.p);
		System.out.println("********************");
		System.out.println("class c static member ="+C.x);
		System.out.println("**********************");
		//Access non static member of class A,B and C
		A a1=new A();
		System.out.println("class A non static member ="+a1.b);
		System.out.println("class A non static member ="+a1.c);
		System.out.println("************************");
		B b1=new B();
		System.out.println("class B non static member ="+b1.q);
		System.out.println("class B non static member ="+b1.r);
		System.out.println("**********************");
		C c1= new C();
		System.out.println("class C non static member ="+c1.y);
		System.out.println("class C non static member ="+c1.z);
	 }
	 }
	 
	 
	 
	 

	 
	



