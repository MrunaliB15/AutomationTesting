package assignment5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB);
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		//click on PIM
		driver.findElement(By.xpath("//li/a/span[text()='PIM']")).click();
		//click on add button
		driver.findElement(By.cssSelector(".orangehrm-header-container .oxd-button.oxd-button--medium.oxd-button--secondary")).click();
		//Enter Employee Name and ID
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Devid",Keys.TAB,"H.",Keys.TAB,"Poul",Keys.TAB,"101");
		//Click on Save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Again click on PIM option
		driver.findElement(By.xpath("//li/a/span[text()='PIM']")).click();
		//Enter created Employee Name and ID
		driver.findElement(By.xpath("//div/div/div/input[@placeholder='Type for hints...']")).sendKeys("Devid");
		driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys("101");
		//Click on Search button
		driver.findElement(By.cssSelector("div.oxd-form-actions>button:nth-child(2)")).click();
		//Verify record is created or not
		
		//Click on Edit button and update required details
		driver.findElement(By.cssSelector(".oxd-icon.bi-pencil-fill")).click();
		//Click on Save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Again click on PIM button
		driver.findElement(By.xpath("//li/a/span[text()='PIM']")).click();
		//Search Employee ID or Name
		driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys("101");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Verify record is updated or not
		
		//Select the record that you created
		driver.findElement(By.cssSelector(".oxd-icon.bi-check.oxd-checkbox-input-icon")).click();
		//Click on 'Delete' button
		driver.findElement(By.cssSelector(".oxd-icon.bi-trash")).click();
		//Click on 'Yes' Delete option
		driver.findElement(By.cssSelector(".oxd-icon.bi-trash.oxd-button-icon")).click();
		//Again click on PIM option
		driver.findElement(By.xpath("//li/a/span[text()='PIM']")).click();
		//Enter ID and search that particular record
		driver.findElement(By.xpath("//div[2]/input[@class='oxd-input oxd-input--active']")).sendKeys("101");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Check Error massage 'NO Record Found'  
		System.out.println("Is Employee is deleted  "+driver.findElement(By.xpath("//span[text()='No Records Found']")).isDisplayed());

	}

}
