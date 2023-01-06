package keyboardAndMouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenGoolge {

	public static void main(String[] args) {
		
		SeleniumResuableFunctions s1=new SeleniumResuableFunctions();
		 
		WebDriver driver=s1.setUp("chrome","https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");

	}

}
