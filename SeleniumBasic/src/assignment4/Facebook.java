package assignment4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		//set browser driver executable path using System.setProperty(keys,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe ");
		//create instance of chrome browser
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		//validate home page
		System.out.println("home page validation: "+driver.getTitle());
		
		List<WebElement> dateOp=driver.findElements(By.className("_9407"));
		for(int i=0;i<dateOp.size();i++) {
			dateOp.get(i).click();
			System.out.println("date field is enable "+dateOp.get(i).isEnabled());
			System.out.println("title of field "+dateOp.get(i).getAttribute("title"));
			System.out.println(" ");
		}
		List<WebElement> Date2=driver.findElements(By.cssSelector("._9407:nth-of-type(1)>option"));
		for(int i=0;i<Date2.size();i++) {
			Date2.get(i).click();
			System.out.println("date field is enable "+Date2.get(i).isEnabled());
			System.out.println("title of field "+Date2.get(i).getText());
			
			List<WebElement> Date1=driver.findElements(By.cssSelector("._9407:nth-of-type(2)>option"));
			for(int a=0;a<Date1.size();a++) {
				Date1.get(a).click();
				System.out.println("date field is enable "+Date1.get(a).isEnabled());
				System.out.println("title of field "+Date1.get(a).getText());
				
				List<WebElement> Date=driver.findElements(By.cssSelector("._9407:nth-of-type(3)>option"));
				for(int b=0;b<Date2.size();b++) {
					Date.get(b).click();
					System.out.println("date field is enable "+Date.get(b).isEnabled());
					System.out.println("title of field "+Date.get(b).getText());
					//Count++;
				}
			}
		}
		//System.out.println("count of test executes: "+Count);
	}
}
