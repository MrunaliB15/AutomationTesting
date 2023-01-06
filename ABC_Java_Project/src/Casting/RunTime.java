package Casting;

class Animal{
	public void eat() {
		System.out.println("animal eat");
	}
}
class herbivores extends Animal{
	public void eat() {
		System.out.println("herbiverous eat plats");
	}
}
class omnivores extends Animal{
	public void eat() {
		System.out.println("omnivores eat plants and meet");
	}
}
class carnivores extends Animal{
	public void eat() {
		System.out.println("carnivores eat meet");
	}
}
public class RunTime {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		System.out.println("***********");
		Animal a1= new herbivores();
		a1.eat();
		System.out.println("************");
		Animal a2=new omnivores();
		a2.eat();
		Animal a3=new carnivores();
		a3.eat();

	}

}
