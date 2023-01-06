package Encapsulation;

class Sampleton{
	int age=25;
	//constructor should be private
	private Sampleton() {
		System.out.println("Sampleton class cons..");
	}
	//create static instance/object of class
	static Sampleton singleobj=new Sampleton();
	//create static method which return current class object
	public static Sampleton getSampletonObject() {
		return singleobj;
	}
	void display() {
		System.out.println("display method age: "+age);
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		Sampleton.getSampletonObject().display(); 
		//OR
		Sampleton s2=Sampleton.getSampletonObject(); //indirect meaning---> Sampleton.getInstance() ---> singleObj --->new Sampleton()
			s2.age=30;
			s2.display();
			s2.age=50;
			Sampleton sx= Sampleton.getSampletonObject();
			sx.display();
	}
}

