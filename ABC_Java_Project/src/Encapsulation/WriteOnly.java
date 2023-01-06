package Encapsulation;

class Student2{
	private int PinCode=442301;
	public void setPinCode(int Pin) {
		PinCode=Pin;
	}
}

public class WriteOnly {

	public static void main(String[] args) {
		Student2 s= new Student2();
		s.setPinCode(12345);
		System.out.println("bye");
	}
}
