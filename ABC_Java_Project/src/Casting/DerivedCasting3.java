package Casting;

class JD{
	public void printme() {
		System.out.println("JD print method");
	}
	void disp() {
		System.out.println(" JD disp.  method");
	}
}
class Android extends JD{
	void printme1() {
		System.out.println("Android print method");
	}
	void disp() {
		System.out.println("Android disp method");
	}
}
class java extends Android{
	void printme2() {
	    System.out.println("java print method");
	}
	void disp() {
		System.out.println("java disp method");
	}
}
public class DerivedCasting3 {

	public static void main(String[] args) {
		JD j1=new java();  //up casting
		j1.printme();
        j1.disp();
        System.out.println("************");
        Android a1=(Android)j1;  // explicit down casting
        a1.printme1();
        a1.disp();
        a1.printme();
        a1.disp();
        System.out.println("**************");
        java j=(java)j1;  //explicit down casting
        j.printme2();
        j.disp();
        j.printme();
        j.disp();
	}

}
