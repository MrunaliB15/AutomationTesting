package Overriding;

class Flowers{
	void colour() {
		System.out.println("colour() of flower class");
	}
}
class Rose extends Flowers{
	void colour() {
		System.out.println("colour() of rose class");
	}
	void fregrence() {
		System.out.println("fregrence() of rose class");
	}
	void work() {
		super.colour();
		fregrence();
		colour();
	}
}
public class SuperKeyword2 {

	public static void main(String[] args) {
		Rose r=new Rose();
		r.work();

	}

}
