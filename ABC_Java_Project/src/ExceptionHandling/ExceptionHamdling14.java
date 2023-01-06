package ExceptionHandling;

public class ExceptionHamdling14 {

	public static void main(String[] args) {
		System.out.println("program start");
		setSleep(2000);
        checkNumber(-5);
        System.out.println("hello");
	}
	static void setSleep(long time) {
		try {
			Thread.sleep(time);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	static void checkNumber(int num) {
		if(num<0) {
		try {
			throw new UserDefineException("no. is less than zero");
		}
		catch (UserDefineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
