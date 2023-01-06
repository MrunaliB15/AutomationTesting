package cssvalidation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeErrorMsgPositionValidation {

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
		//identify username input field
		WebElement usernameInputField=driver.findElement(By.cssSelector("username"));
		//for error msg position validation, get error msg and username field x & y cords
		Point errorPosition =errorMsg.getLocation();
		int error_X_Cord=errorPosition.getX();
		int error_Y_Cord=errorPosition.getY();
		System.out.println("Error msg X_Cord: "+error_X_Cord);
		System.out.println("Error msg Y_Cord: "+error_Y_Cord);
		
		Point usernamePosition=usernameInputField.getLocation();
		int username_X_Cord=usernamePosition.getX();
		int username_Y_Cord=usernamePosition.getY();
		System.out.println("username X_Cord: "+username_X_Cord);
		System.out.println("username Y_Cord: "+username_Y_Cord);
		System.out.println("Is error msg getting displayed above username input field: "+(error_Y_Cord<username_Y_Cord));
	}

}