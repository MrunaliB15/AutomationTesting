package handlingmultipleelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategories {

	public static void main(String[] args) {
		 //set driver executable path using System.setProperty(String keys,String values)
		 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		 //create instance of Chrome browser
		 WebDriver driver= new ChromeDriver();
		 //maximize browser
		 driver.manage().window().maximize();
		 //implicit wait
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 //enter URL
		 driver.get("https://www.demoblaze.com/");
		 
		 WebElement categories= driver.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
		 System.out.println(categories.isDisplayed());
		 System.out.println(categories.isEnabled());
		 System.out.println(categories.getText().equals("CATEGORIES"));
		 
		 WebElement phone=driver.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
		 System.out.println(phone.isDisplayed());
		 System.out.println(phone.isEnabled());
		 System.out.println(categories.getText().equals("Phones"));
		 
		 WebElement laptop=driver.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
		 System.out.println(laptop.isDisplayed());
		 System.out.println(laptop.isEnabled());
		 System.out.println(categories.getText().equals("laptops"));
		 
		 WebElement monitor=driver.findElement(By.cssSelector(".list-group>*:nth-child(4)"));
		 System.out.println(monitor.isDisplayed());
		 System.out.println(monitor.isEnabled());
		 System.out.println(categories.getText().equals("Monitors"));
	}

}
