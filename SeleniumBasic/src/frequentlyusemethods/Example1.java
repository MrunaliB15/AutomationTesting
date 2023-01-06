package frequentlyusemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		// runtime poly-inheritance, up casting & overriding
		WebDriver driver= new ChromeDriver(); 
         // enter required URL
		driver.get("https://demo.automationtesting.in/Register.html");
		String pageTitle=driver.getTitle();
		System.out.println("page title: "+pageTitle);
		System.out.println("page title validation: "+pageTitle.equals("Register"));
		// get current page URL
		System.out.println("page URL is: "+driver.getCurrentUrl());
		// get page source code
		String sourceCode= driver.getPageSource();
		System.out.println("page source code is: "+sourceCode);
		System.out.println("Source code length: "+sourceCode.length());
		driver.close();
	}

}
