package Overriding;

class Birds{
	void move() {
		System.out.println("birds can move");
	}
}
class Crow extends Birds{
	void move() {
		System.out.println("crow can fly and walk");
	}
	void walk() {
		System.out.println("crow can walk");
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		Birds b1= new Birds();
		b1.move();
		Crow c1=new Crow();
         c1.move();
         c1.walk();
         Birds b2= new Crow();
         b2.move();
         
	}

}
