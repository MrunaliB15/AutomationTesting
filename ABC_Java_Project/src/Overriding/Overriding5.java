package Overriding;

class parent1{
	private void m1() {
		System.out.println("from parent1 class m1");
	}
	protected void m2() {
		System.out.println("from parent1 class m2");
	}
}
class child1 extends parent1{
	private void m1() {
		System.out.println("from child1 class m1");
	}
	protected void m2() {
		System.out.println("from child1 class m2");
	}
}
public class Overriding5 {

	public static void main(String[] args) {
		parent1 obj= new parent1();
          obj.m2();
          parent1 obj1= new child1();
          obj1.m2();
	}

}
