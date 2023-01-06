package assignment3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {
		//set browser driver executable path using System.setProperty(keys,value)
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe ");
		//create instance of chrome browser
		WebDriver driver=new ChromeDriver();
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//maximize
		driver.manage().window().maximize();
        //enter URL
		driver.get("https://www.flipkart.com/");
		String pageTitle=driver.getTitle();
		//home page validation
		System.out.println("home page validation: "+pageTitle.equals("Flipkart"));
		//get main menu option count
		List<WebElement> Options=driver.findElements(By.cssSelector("._37M3Pb"));
		//print main menu option name
		//System.out.println("options name: "+Options.get(0).getText());
		for(int i=0;i<Options.size();i++) {
			System.out.println("Options"+i+";"+Options.get(i).getText());
		}
	}

}
