package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

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
        driver.get("https:\\www.google.com");
        driver.findElement(By.name("q")).sendKeys("Manual Interview Questions");
        
        List<WebElement> sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
        System.out.println("suggetion count: "+sugg.size());
        for(int i=0;i<sugg.size();i++) {
      //to avoid SteleElementException, re-identify all the suggestions
        sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
        System.out.println(sugg.get(i).getText());
        }
	}
}
