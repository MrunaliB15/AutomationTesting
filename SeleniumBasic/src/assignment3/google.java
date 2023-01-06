package assignment3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

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
			driver.get("https://www.google.com/");
			
			driver.findElement(By.name("q")).sendKeys("Automation Testing");
			
			List<WebElement> list=driver.findElements(By.cssSelector("div>div>div>ul>li>div"));
			System.out.println("suggestion count: "+list.size());
			for(int i=0;i<list.size();i++) {
				//to avoid selectElementException, re-identify all the suggestion
			list=driver.findElements(By.cssSelector("ul>li>div>div>div>span"));
			System.out.println(list.get(i).getText());
			}
	}
}
