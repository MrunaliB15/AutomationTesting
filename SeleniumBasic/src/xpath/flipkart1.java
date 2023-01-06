package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart1 {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		WebElement Blanket=driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[2]"));
	    System.out.println(Blanket.getText());
	}

}
