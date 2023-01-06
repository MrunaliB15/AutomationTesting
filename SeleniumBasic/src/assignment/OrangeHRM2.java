package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("login apge: "+driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("Admin");
        driver.findElement(By.name("pwd")).sendKeys("admin123");
        driver.findElement(By.id("loginButton")).click();
        System.out.println("home page: "+driver.getTitle());
	}

}
