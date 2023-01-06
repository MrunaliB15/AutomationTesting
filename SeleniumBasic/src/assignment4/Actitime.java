package assignment4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) {
		//set browser driver executable path using System.setProperty(keys,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe ");
		//create instance of chrome browser
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
        //enter user name and password
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		//task tab
		driver.findElement(By.id("container_tasks")).click();
		//click on add New button & select new task
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		//select customer and project
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".projectSelector .selectedItem")));
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		List<WebElement> projectList=driver.findElements(By.cssSelector(".projectSelector .searchItemList>div"));
		projectList.get(3).click();
		//enter task name as testing
		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing");
		//deadline date from next month
		driver.findElement(By.cssSelector("x-btn-text")).click();
		driver.findElement(By.cssSelector("a[title='Next Month (Control+Right)']")).click();
		//work type as Testing
		driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(2)>td:nth-of-type(3)>a>em>span")).click();
		driver.findElement(By.cssSelector(".taskTableContainer .value.ellipsis")).click();
		driver.findElements(By.cssSelector(".taskTableContainer .typeOfWorkList>div>div")).get(8).click();
		//click on create task button
		driver.findElement(By.cssSelector("basicLightboxFooter.components_button_label")).click();
		//select task checkbox
		driver.findElement(By.cssSelector(".checkmark.checkMark")).click();
		//click on delete link
		driver.findElement(By.cssSelector(".delete.button")).click();
		
	}

}
