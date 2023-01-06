package browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		//set driver executable path using .System.setproperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		// create an instance of required browsers class
          ChromeDriver cdrivers= new ChromeDriver();
	}

}
