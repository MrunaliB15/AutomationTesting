package ExceptionHandling;

public class ExceptionHandling9_2 {
	public static void signalTimeOut(long time)  {
		System.out.println("signal start");
		if(time>1000) {
		try {
			Thread.sleep(time);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
		else {
			System.out.println("person is elligible to vote");
		}
		System.out.println("signal end");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		signalTimeOut(5000);
		System.out.println("rest of the code");
	}
	

}
