package ExceptionHandling;

// throwing user define exception
class UserDefineException extends Exception{
   public UserDefineException(String str) {
	super(str);
   }
}
 public class ExceptionHandling10_1{
	 public static void validateAge(int age) {
		 if(age<18) {
		 try {
			throw new UserDefineException("person is not elligible for vote");
		 }
		 catch(UserDefineException e) {
			 System.out.println("Exception found: "+e);
		 }
	 } else {
		 System.out.println("person is elligible for vote");
	 }
 }
     public static void main(String args[]) {
		System.out.println("Method started");
		validateAge(15);
		System.out.println("Rest of the code..");
     }
 }