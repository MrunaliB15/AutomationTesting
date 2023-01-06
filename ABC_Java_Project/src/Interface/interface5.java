package Interface;

interface Animal{
	int age=15;
	abstract void sound();
	void sleep();
}
interface Reptile{
	void colour();
}
class cat implements Animal{
	public void sound() {
		System.out.println("cat says meow meow");
}
	public void sleep() {
		System.out.println("sleep of cat class");
	}
}
class dog extends cat implements Reptile{
	public void sound() {
		System.out.println("dog says bow bow");
	}
	public void colour() {
		System.out.println("dogs colour is white");
	}
}
public class interface5 {

	public static void main(String[] args) {
		cat mycat=new cat();
		mycat.sound();
        mycat.sleep();
        System.out.println("***********");
        dog mydog=new dog();
        mydog.sound();
        mydog.colour();
        mydog.sleep();
        System.out.println("animal age: "+Animal.age);
	}

}
