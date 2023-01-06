package frequentlyusemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe" );
		
        WebDriver driver= new ChromeDriver();
        //enter required URL
        driver.get("https://demo.actitime.com/login.do");
       
 //       WebElement usernameInputField=driver.findElement(By.id("username"));
 //      usernameInputField.sendKeys("admin");*/
                //OR
         driver.findElement(By.id("username")).sendKeys("admin");
        
 //       WebElement passwordInputField= driver.findElement(By.name("pwd"));
 //     passwordInputField.sendKeys("manager");*/
                //OR
        driver.findElement(By.name("pwd")).sendKeys("manager");
 
 //       WebElement loginBtn= driver.findElement(By.id("loginButton")); 
  //      loginBtn.click();
        driver.findElement(By.id("loginButton")).click();
        
        driver.close();
	}

}
