package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeTaskCreation {

	private static final String TimeUnits = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
        //click on login button
		driver.findElement(By.id("loginButton")).click();
		//click on task
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".projectSelector .selectedItem")));
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		List<WebElement> projectList=driver.findElements(By.cssSelector(".projectSelector .searchItemList>div"));
		projectList.get(3).click();
		//enter task name
		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing");
		//enter deadline
		driver.findElement(By.cssSelector("..x-btn-text")).click();
		//for next month
		driver.findElement(By.cssSelector("a[title='Next Month (Control+Right)']")).click();
		//select next month date
		driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(2)>td:nth-of-type(3)>a>em>span")).click();
		//type of work
		driver.findElement(By.cssSelector(".taskTableContainer .value.ellipsis")).click();
		driver.findElement(By.cssSelector(".taskTableContainer .typeOfWorkList>div>div")).click();
		driver.findElement(By.cssSelector(".basicLightboxFooter .components_button_label")).click();
		
	}

}
