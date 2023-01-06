package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazePhones {

	public static void main(String[] args) {
		String driverPath=System.getProperty("user.dir")+"\\executabe\\chromedriver.exe";
		//set driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe ");
		//create instance of chrome browser
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement> phones= driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("no. of phones present on home page: "+phones.size());
		for(WebElement element:phones) {
			System.out.println(element.getText());
		}
	}

}
