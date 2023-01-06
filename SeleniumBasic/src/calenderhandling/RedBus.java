package calenderhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");
		//from pune to goa
		driver.findElement(By.id("src")).sendKeys("Pune");
		driver.findElement(By.cssSelector("div:nth-of-type(1).fl.search-box.clearfix")).click();
		driver.findElement(By.id("dest")).sendKeys("Goa");
		driver.findElement(By.cssSelector("div:nth-of-type(2).fl.search-box ")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.cssSelector("tr:nth-of-type(6)>td:nth-of-type(4).wd.day")).click();
		driver.findElement(By.id("search_btn")).click();
		List<WebElement> BusName=driver.findElements(By.cssSelector("li .travels.lh-24.f-bold.d-colour"));
		for(int i=0; i<BusName.size(); i++) {
			System.out.println(BusName.get(i).getText());
		}
	}

}
//sendKeys("12-Jan-2023");
/**driver.findElement(By.id("dt6 am to 12 pm")).click();
driver.findElement(By.id("bt_AC")).click();
driver.findElement(By.cssSelector(".travels.lh-24.f-bold.d-color"));
driver.findElement(By.cssSelector(".fare.d-block"));*/