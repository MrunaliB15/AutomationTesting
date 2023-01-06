package keyboardAndMouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        //maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//URL
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
	}

}
