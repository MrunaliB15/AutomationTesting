package Overriding;
class parent2{
	//can't be Overriden
	final void msg() {
		System.out.println("i am final method of parent class");
	}
}
class child2 extends parent2{
	final void msg() {                  // msg is declare as final
		System.out.println("i am msg method of child class2");//msg() produce error
	}
}
public class Overriding6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
