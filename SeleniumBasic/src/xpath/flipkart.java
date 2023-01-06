package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
		
		System.out.println(driver.findElement(By.xpath("//div[div[a[text()='SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']]]/div[3]/div/div[1]")).getText());
	}

}
