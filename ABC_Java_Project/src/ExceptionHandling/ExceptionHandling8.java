package ExceptionHandling;

public class ExceptionHandling8{
	
	public static void signalTimeOut(long time) throws InterruptedException{
		System.out.println("signal started");
		if(time>1000) {
			Thread.sleep(time);
		}
		else {
			System.out.println("personis elligible for vote");
		}
		System.out.println("signal end");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("program start here");
		signalTimeOut(5000);                            //5sec39
		System.out.println("end here");
	}

}
