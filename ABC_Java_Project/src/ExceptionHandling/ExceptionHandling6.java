package ExceptionHandling;

public class ExceptionHandling6 {

	public static void main(String[] args) {
		/**try {
		System.out.println("inside the try block");
		int data= 25/5;
		//System.exit(0)
		System.out.println(data);
		}
		//cannot handle Arithmetic type execution only accept NullPointer type execution
	catch (NullPointerException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("inside finally blocks");
		int k=10/0;
		System.out.println("finally block always executed");
	}
		System.out.println("rest of code");
	*/
	
	try {
		System.out.println("inside the try block");
		int data=25/0;
		System.out.println(data);
	}
	//handle Arithmetic exception/-divide by zero exception
	catch(ArithmeticException e){
		System.out.println("Exception Handle");
		System.out.println(e);
	}
	finally {
		System.out.println("finally block is always executed");
	}
	System.out.println("rest of the code");
	}
}

