package Overriding;
class XYZ{
	void myMethod() {
		System.out.println("method of XYZ class");
	}
}
class Student extends XYZ{
	void myMethod() {
		super.myMethod();
		System.out.println("method of Student class");
	}
}
public class Overriding3 {


	public static void main(String[] args) {
		Student s= new Student();
		s.myMethod();
	}

}
