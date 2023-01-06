package Inheritance;

 class Grandmother {
	Grandmother(){
	System.out.println("i am grandmother class constructor");
	}
	void myhome() {
		System.out.println("i am grandmother home");
	}
}
 class Mother extends Grandmother {
	 Mother(double d){
		 super();
		 System.out.println("i am mother class constructor");
		}
	 void mycar() {
		 System.out.println("i am mother car");
	 }
 }
 class Daughter extends Mother{
	 Daughter(int i){
		 super(12.3);
		 System.out.println("i am Daughter class constructor");
		 }
	 void bike() {
		 System.out.println("i am daughter bike");
	 }
 }

public class Inheritance5 {

	public static void main(String[] args) {
		Daughter D1= new Daughter(21);
		D1.bike();
		D1.mycar();
		D1.myhome();
		System.out.println("*************");
		Mother M1= D1;
		 M1.mycar();
		 M1.myhome();
		 System.out.println("*************");
		 Grandmother G1= D1;
           G1.myhome();
           System.out.println("*************");
           Grandmother g1 = new Mother(12.3);
           g1.myhome();
	}
}
 