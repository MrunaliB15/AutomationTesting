package keyboardAndMouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps3 {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
        //maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='first Name']"));
		//type first name as admin and press ctrl+a
		/**firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		//in firstName field use ctrl+c
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));*/
		            //OR
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		//in last name field use ctrl+v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
		.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
	}

}
