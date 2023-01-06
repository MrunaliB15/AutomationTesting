package assignment5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
        
        Actions act=new Actions(driver);
        List<WebElement> mainMenu=driver.findElements(By.xpath("//div[@class='_37M3Pb']/div/a/div/div/img"));
        for(int i=0; i<mainMenu.size(); i++) {
        	WebElement option=mainMenu.get(i);
        	act.moveToElement(option).perform();
        	try {
        		Thread.sleep(1000);
        	}catch(InterruptedException e) {
        		e.printStackTrace();
        	}
        }
	}
}
