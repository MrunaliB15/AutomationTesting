package ExceptionHandling;

//throwing user define exception
 
class DiaryException extends Exception{
	public DiaryException(String str) {
		super(str);
	}
}
public class ExceptionHandling10 {

	public static void validateAge(int age)   throws DiaryException {
		if(age<18) {
		throw new DiaryException(" you are not elligible to vote");
		}
		else {
			System.out.println("you are elligible to vote");
		}
	}
	public static void main(String[] args) throws DiaryException{
		System.out.println("main method start");
		//validateAge(16);   //direct execution
		try {
			validateAge(16);
		}                           // by try and catch
		catch(DiaryException e) {
			System.out.println("Exception found: "+e);
		}
		System.out.println("rest of code");
	}

}
