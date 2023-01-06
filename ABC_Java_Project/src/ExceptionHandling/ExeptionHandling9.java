package ExceptionHandling;

public class ExeptionHandling9 {
	
	public static void signalTimeOut(long time) throws InterruptedException{
		System.out.println("signal start");
		if(time>1000) {
			Thread.sleep(time);
		}
	else {
		System.out.println("persn is elligible for vote");
	}
		System.out.println("signal end");
	}
	public static void main(String[] args) {
		System.out.println("program start here");
		try {
			signalTimeOut(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}

}
