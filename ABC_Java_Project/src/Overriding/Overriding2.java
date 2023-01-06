package Overriding;

class Animal{
	void move() {
		System.out.println("Animal can move");
	}
	void display(){
		System.out.println("Animal class display...");
	}
}
class dog extends Animal{
	void move() {
		super.move();
		System.out.println("dog can run and walk");
		display();
	}
	
}
public class Overriding2 {

	public static void main(String[] args) {
		Animal a1=new dog();
		a1.move();

	}

}
