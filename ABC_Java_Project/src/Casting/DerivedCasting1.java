package Casting;

class parent {
	void showme() {
		System.out.println("show me method of prent class");
	}
	void callme() {
		System.out.println("call me method of parent class");
	}
}
class child extends parent{
	void readme() {
		System.out.println("read me mathod of child class");
	}
}
public class DerivedCasting1 {

	public static void main(String[] args) {
		child c1=new child();
          c1.readme();
          c1.showme();
          c1.callme();
          System.out.println("******************");
          parent p1 =new parent();
          p1.showme();
          p1.callme();
          System.out.println("*******************");
          parent p2=new child();  // auto up /implicit casting
          p2.showme();
          p2.callme();
          System.out.println("*****************");
          child c2=new child(); //reference and object both are child
          c2.readme();
          c2.showme();
          c2.callme();
          System.out.println("*****************");
          parent p3=(parent)c2;   // explicit up casting
          p3.showme();
          p3.callme();
	}

}
