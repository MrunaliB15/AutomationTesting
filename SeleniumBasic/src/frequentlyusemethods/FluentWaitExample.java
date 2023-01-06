package frequentlyusemethods;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample {

	public static void main(String[] args) {
		//set required browser driver executable path using system.setProperty(keys,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance of required browser class
		WebDriver driver= new ChromeDriver();
		// enter URL
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("login page title: "+driver.getTitle());
		// enter username as admin 
		driver.findElement(By.id("username")).sendKeys("admin");
		// enter password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// click on login button
        driver.findElement(By.id("loginButton")).click();
        
        //create an instance of fluentWait class with timeout,polling time(retry) and exception to be ignored
        FluentWait wait= new FluentWait(driver)
        .withTimeout(Duration.ofSeconds(20))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);
        // implement condition for wait, poling works like 5,10,15 and 20
        wait.until(ExpectedConditions.elementToBeClickable(By.id("LogoutLink")));
        // click on logoutLink
        driver.findElement(By.id("LogoutLink")).click();
	}

}
