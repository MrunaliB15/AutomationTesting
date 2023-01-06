package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class executeAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		//create an instance of required browser class
		FirefoxDriver driver= new FirefoxDriver();
            
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//enter URL
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		//page title and title length
		String pageTitle= driver.getTitle();
		System.out.println("page title: "+pageTitle);
		System.out.println("page title length: "+pageTitle.length());
		
         // enter user name and password
		WebElement usernameInputField=driver.findElement(By.name("UserName"));
		usernameInputField.sendKeys("execution");
		
		WebElement passwordInputField=driver.findElement(By.name("Password"));
		passwordInputField.sendKeys("admin");
		
		// login button
		WebElement loginBtn=driver.findElement(By.id("Login"));
		loginBtn.click();
		
		//page title and current URL
		System.out.println("page title: "+pageTitle);
		
		//System.out.println("");
		//logout
		WebElement logoutBtn=driver.findElement(By.id("Logout"));
		logoutBtn.click();
	}
}
