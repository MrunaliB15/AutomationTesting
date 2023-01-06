package ExceptionHandling;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("ArrayIndexOutOfBonuds Exception occurs 1");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithneticException occurs 2");
		}
		catch(Exception e) {
			System.out.println("Exception occurs 3");
		}
		try {
			int a[]=new int[5];
			a[5]=30/2;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBonuds Exception occurs A");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithneticException occurs B");
		}
		catch(Exception e) {
			System.out.println("Exception occurs C");
		}
		
		System.out.println("rest of the code");
	}

}
