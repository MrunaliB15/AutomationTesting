package Encapsulation;

class Student{
	private int pinCode=442031;
	public int getpinCode() {
		return pinCode;
	}
}

public class ReadOnly {

	public static void main(String[] args) {
		Student s= new Student();
		System.out.println(s.getpinCode());
	}

}
