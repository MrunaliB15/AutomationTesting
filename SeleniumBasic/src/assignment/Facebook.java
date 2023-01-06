package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 // enter URL
		 driver.get("https://www.facebook.com");
		 //home page title
		 String pageTitle=driver.getTitle();
		 System.out.println("page title: "+pageTitle);
		 
		 String ActualURL= driver.getCurrentUrl();
		 System.out.println("actual url: "+ActualURL);
		 System.out.println("url validation: "+ActualURL.equals("https://www.facebook.com"));
		 driver.close();
	}

}
