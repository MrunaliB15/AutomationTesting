package frequentlyusemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElement2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Login page title: "+driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("logout")).click();
		//it will give No SuchElement Exception, as our automation script speed is not in sync with application
	}

}
