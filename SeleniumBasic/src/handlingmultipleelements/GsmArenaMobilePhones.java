package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaMobilePhones {

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
        driver.get("https://www.gsmarena.com/samsung-phones-9.php");
        List<WebElement> deviceList=driver.findElements(By.cssSelector("ul>li>a>strong>span"));
        System.out.println("deviceList count: "+deviceList.size());
        for(int i=0; i<deviceList.size(); i++) {
        	System.out.println(deviceList.get(i).getText());
        }
	}

}
