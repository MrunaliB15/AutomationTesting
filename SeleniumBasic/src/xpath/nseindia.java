package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nseindia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
        WebDriver driver= new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.nseindia.com/");
        System.out.println(driver.findElement(By.xpath("//tr[td[a[text()='HDFC']]]/td[9]")).getText());
	}

}
