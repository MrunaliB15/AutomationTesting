package ExceptionHandling;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) {
		System.out.println("program start here ...");
		int i=10;
		try {
		int j=i/0;
		System.out.println("result: "+j);
		}
		catch(ArithmeticException obj) {
			obj.printStackTrace();
		}
		System.out.println("program ends here...");
	}

}
