package assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {

	public static void main(String[] args) {
		//set required browser driver executable path using System.setProperty(keys,values)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance of required browser class
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// enter URL
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//verify login page
		String pageTitle=driver.getTitle();
		//System.out.println("login page: "+driver.getTitle());
		//enter user name 
		driver.findElement(By.id("username"));
		//enter password
		driver.findElement(By.id("password"));
		//click on login button
		driver.findElement(By.className("buttonBlue")).click();
		//validate home page
		System.out.println("home page validation: "+pageTitle.equals("vtiger"));
		//click on add widget
		driver.findElement(By.linkText("History")).click();
		driver.findElement(By.linkText("Upcoming Activities")).click();
		driver.findElement(By.linkText("Funnel")).click();
		//logout from application
		driver.findElement(By.className("addButton")).click();
		
	}

}
