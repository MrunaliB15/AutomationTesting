package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samsung1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		//maximize
       driver.manage().window().maximize();
       //implicit wait
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       //enter url
       driver.get("https://www.demoblaze.com");
      System.out.println(driver.findElement(By.xpath("//div[h4[a[text()='Samsung galaxy s6']]]/h5")).getText());
	}

}
