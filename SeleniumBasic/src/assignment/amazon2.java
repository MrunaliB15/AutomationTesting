package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String pageTitle= driver.getTitle();
		System.out.println("page title: "+driver.getTitle());
		System.out.println("page title validation: "+pageTitle.equals(pageTitle));
		
		String ActualURL= driver.getCurrentUrl();
		System.out.println("page URL: "+ActualURL);
		System.out.println("URL validation: "+ActualURL.equals("https://www.amazon.in/"));
		
		String SourceCode= driver.getPageSource();
		System.out.println("source code: "+SourceCode);
		System.out.println("source code length: "+SourceCode.length());

	}

}
