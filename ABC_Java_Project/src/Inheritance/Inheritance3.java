package Inheritance;

class vehicle{
	public void wheels() {
		System.out.println("i have  wheel");
	}
}
class autorikshow extends vehicle{
	public void countwl() {
		System.out.println("i am autorikshow havinfg 3 wheels");
	}
}
class bike extends vehicle{
	public void countwl() {
		System.out.println("i am bike having 2 wheels");
	}
}
class scooter extends vehicle{
	public void countwl() {
		System.out.println("i am scooter having 2 wheels");
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		bike b= new bike();
		b.wheels();
		b.countwl();
		System.out.println("==========");
		scooter sc= new scooter();
		sc.wheels();
		sc.countwl();
		System.out.println("==========");
		autorikshow cr= new autorikshow();
	    cr.wheels();
	    cr.countwl();
	}
}
