package PackageModifiers;

//code from filename:Main.java
abstract class Main{
	public String name="John";
	public int age=24;
	public abstract void study(); //abstract method
}
// subclass (inherited from main)
class Student extends Main{
	public int graduationyear= 2018;
	public void study() {  // body of abstract method 
		System.out.println("Studing all day long");
	}
}

public class AbstractKeyword {

	public static void main(String[] args) {
		Student myobj= new Student() ;
		System.out.println("Name: "+myobj.name);
		System.out.println("Age: "+myobj.age);
		System.out.println("graduationyear: "+myobj.graduationyear);
		myobj.study();
	}

}
