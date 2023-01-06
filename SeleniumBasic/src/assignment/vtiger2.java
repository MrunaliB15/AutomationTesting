package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger2 {

	public static void main(String[] args) {
		//set required browser driver executable path using system.setproperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//instance of required browser class
		WebDriver driver= new ChromeDriver();
		// set implicit wait for web driver
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// enter application URL
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//enter Username
		WebElement username=driver.findElement(By.id("username"));
         username.clear();
         username.sendKeys("admin");
         //enter password
         WebElement pwd= driver.findElement(By.id("password"));
         pwd.clear();
         pwd.sendKeys("Test@123");
         //click on login button
         //driver.findElement(By.className("buttonBlue")).click();
	}

}
