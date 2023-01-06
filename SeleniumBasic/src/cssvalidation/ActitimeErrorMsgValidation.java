package cssvalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeErrorMsgValidation {

	public static void main(String[] args) {
		//set  browser driver executable path using System.setProperty(keys,values)
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create an instance of chrome browser
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//enter URL
		driver.get("https://demo.actitime.com");
        //click on login button
    	driver.findElement(By.id("loginButton")).click();
    	//Explicit wait
    	WebDriverWait wait=new WebDriverWait(driver,30);
    	wait.until(ExpectedConditions.textToBe(By.cssSelector(".errormsg"),"Username or Password is invalid. Please try again."));
    	//identify error msg
    	WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
    	
    	String errorColourInRGBA=errorMsg.getCssValue("Colour");
    	String errorfontSize=errorMsg.getCssValue("font-size");
    	System.out.println("error msg colour code: "+errorColourInRGBA);
    	System.out.println("error msg font size: "+errorfontSize);
	}

}
