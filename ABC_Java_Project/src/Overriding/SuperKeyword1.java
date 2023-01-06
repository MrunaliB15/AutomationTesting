package Overriding;

class smallAnimal{
	String colour="white of black";
}
class cat extends smallAnimal{
	String colour="white";
	void printcolour() {
	System.out.println("dog colour is: "+colour);
	System.out.println("Animal colour is: "+super.colour);
	}
}
public class SuperKeyword1 {

	public static void main(String[] args) {
		cat d1=new cat();
          d1.printcolour();
	}

}
