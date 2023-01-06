package frequentlyusemethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocateElement3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// implicit wait- Browser instance will get time to wait for element
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Login page title: "+driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		// create an instance of WebDriverWait
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		                                            
		System.out.println("home page title: "+driver.getTitle());
		driver.findElement(By.id("logoutLink")).click();
		
	}

}
