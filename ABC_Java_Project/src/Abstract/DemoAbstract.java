package Abstract;

abstract class Abs{
	abstract void call1();
	abstract void call2();
    
	//void display() {
	//	System.out.println("hellow");
	//}
}
abstract class Abs1{
	abstract void call1();
	abstract void call2();
}
// abstract class Abs2{
//	 void display() {
	// }
// }
public class DemoAbstract extends Abs1 {
	void call1() {
		System.out.println("hellow");
	}
	void call2() {
		System.out.println("hey");
	}

	public static void main(String[] args) {
		DemoAbstract d1=new DemoAbstract();
		d1.call1();
		d1.call2();
	}

}
