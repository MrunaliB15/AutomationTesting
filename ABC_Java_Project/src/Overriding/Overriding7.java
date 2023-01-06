package Overriding;

class parent3{
	// Static method in base class which will be hidden in subclass
	static void m3() {
		System.out.println("from parent "+"static m3()");
	}
	// Non-static method which will be overridden in derived class
	void m4(){
		System.out.println("from parent "+" non static m4()");
	}
}
class child3 extends parent3{
	// This method hides m1() in Parent
	static void m3() {
		System.out.println("from child class static m3()");
	}
	// This method overrides m2() in Parent
	@Override
	public void m4() {
		System.out.println("from child "+" non static m4()");
	}
}
public class Overriding7 {

	public static void main(String[] args) {
		parent3 p1=new child3();
          p1.m3();
       // Here overriding works and Child's m2() is called
          p1.m4();
	}

}
