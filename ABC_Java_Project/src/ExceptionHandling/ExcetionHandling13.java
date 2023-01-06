package ExceptionHandling;

public class ExcetionHandling13 {
	static void method() {
		System.out.println("inside the method");
		throw new ArithmeticException("throwing ArithmeticException");
	}

	public static void main(String[] args) {
		try {
			method();
		}
		catch(ArithmeticException e) {
			System.out.println("caught in main() method");
		}
		System.out.println("rest of the code");

	}

}
