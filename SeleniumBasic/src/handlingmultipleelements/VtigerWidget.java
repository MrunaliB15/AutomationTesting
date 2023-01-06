package handlingmultipleelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerWidget {

	public static void main(String[] args) {
		//set browser driver executable path using System.setProperty(key,value)
	    System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe ");
	    //create instance of chrome browser
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//enter URL
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.className("buttonBlue")).click();
        driver.findElement(By.className("addButton")).click();
	}

}
