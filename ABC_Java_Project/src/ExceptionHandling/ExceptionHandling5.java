package ExceptionHandling;

public class ExceptionHandling5 {

	public static void main(String[] args) {
	   try {
		   int data=25/0;           //code do not throw any exception
		   System.out.println(data);
	   }
	   catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("Exception handling");  //catch won't be executed
	   }
	   //executed regardless exception occurs or not
	   finally {
		   System.out.println("finally block always executed");
	   }
	   System.out.println("rest of code");
		}
	}