package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        
		WebDriver driver= new ChromeDriver();
		// enter URL
		driver.get("https://demo.actitime.com/login.do");
		//page title name and length
		String pageTitle=driver.getTitle();
		System.out.println("page title: "+pageTitle);
		System.out.println("page title length: "+pageTitle.length());
		//page URL
		driver.get("https://demo.actitime.com/login.do");
		//page source code and length
		String sourceCode= driver.getPageSource();
		System.out.println("page source code is: "+sourceCode);
		System.out.println("source code length: "+sourceCode.length());
		//page length
		//String page=driver.();
		//System.out.println("page Length: "+page.length());
		driver.close();
		
	}

}
