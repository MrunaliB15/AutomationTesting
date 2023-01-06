package ScannarAndSystemClass;

public class SystemEx2 {

	public static void main(String[] args) {
		System.out.println("System user Dir: "+System.getProperty("user.home"));
		System.out.println("current working Dir: "+System.getProperty("user Dir"));
		//clearing this directory
		System.out.println("user.home");
		System.out.println(System.getProperty("user.home"));
		//setting up new information
		System.setProperty("user.home","my name is Devid");
		System.out.println("updated system user Dir: "+System.getProperty("user.home"));
		//setting specific property
		System.setProperty("user country", "INDIA");
		System.out.println(System.getProperty("user.home"));
		System.out.println("difference between current time and midnight time: "+System.currentTimeMillis());
		System.out.println("current time in: "+"nano time: "+System.nanoTime());
	}

}
