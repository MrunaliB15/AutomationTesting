package frequentlyusemethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		//set required browser driver executable path using system.setproperty(keys,values)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance of required browser class
		WebDriver driver= new ChromeDriver();
		// set implicit wait for web driver
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//enter URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// enter username
		driver.findElement(By.name("username")).sendKeys("Admin");
		// enter password
		driver.findElement(By.name("password")).sendKeys("admin123");
        // click on login button
		driver.findElement(By.className("orangehrm-login-button")).click();
	}

}
