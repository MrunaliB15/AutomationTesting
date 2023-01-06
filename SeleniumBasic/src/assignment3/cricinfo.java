package assignment3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Options;

public class cricinfo {

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
		driver.get("https://www.espncricinfo.com/");
        // validate home page
		String homePage=driver.getTitle();
		System.out.println("home page validation: "+homePage.equals("espncricinfo"));
		//get main menu option count
		List<WebElement> Options=driver.findElements(By.cssSelector("div>div.ds-propper-wrapper>a.ci-nav-text"));
		System.out.println(Options.size());
		for(int i=0;i<Options.size();i++) {
			System.out.println(Options.get(i).getText());
		}
		
	}

}
