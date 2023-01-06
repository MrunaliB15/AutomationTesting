package Constructor;

 class A{
	int i=10;
	A(){
		System.out.println("class A constructor");
	}
	void display() {
		System.out.println("display of class A");
	}
 }
	class B{
		int j=20;
		B(){
			System.out.println("class B constructor");
		}
		void display() {
			System.out.println("display of class B");
		}
	}
  class Cons{
	void display() {
		System.out.println("display of cons class");
	}
		public static void main(String[] args) {
			System.out.println("main of cons is started");
			A a1 = new A();
			a1.display();
			System.out.println("class A global variable i = "+a1.i);
			B b1 = new B();
			b1.display();
			System.out.println("class b global variable j = "+b1.j);
			Cons c1 = new Cons();
			c1.display();
			System.out.println("main of cons is end");
		}
}

