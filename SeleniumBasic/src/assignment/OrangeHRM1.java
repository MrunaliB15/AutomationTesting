package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 String PageTitle=driver.getTitle();
		 System.out.println("page title: "+driver.getTitle());
		 System.out.println("page title validation: "+PageTitle.equals(PageTitle));
		 
		 String ActualURL=driver.getCurrentUrl();
		 System.out.println("page URL: "+ActualURL);
		 System.out.println("Url validaion: "+ActualURL.equals("https://opensource-demo.orangehrmlive.com/"));
		 
		 String SourceCode=driver.getPageSource();
		 System.out.println("page source code: "+SourceCode);
		 System.out.println("source code length: "+SourceCode.length());
	}

}
