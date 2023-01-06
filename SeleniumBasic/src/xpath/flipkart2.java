package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart2 {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
        
		WebElement Blanket=driver.findElement(By.xpath("//div[text()='Blankets']"));
		System.out.println(Blanket.getText());
	}

}
