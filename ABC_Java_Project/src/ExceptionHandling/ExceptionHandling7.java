package ExceptionHandling;
//throwing unchecked exception
public class ExceptionHandling7 {

	public static void validateAge(int age) {
		if(age<18){ 
			throw new ArithmeticException("person is not elligible to vote..");
		}
		else {
			System.out.println("person is  elligible for vote");
		}
	}
	public static void main(String[] args)  {
		/**try {
			validateAge(13);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handle..");
			System.out.println(e);
		}*/
			
		System.out.println("program start here");
		validateAge(13);
		System.out.println("rest of the code");
	}
}

