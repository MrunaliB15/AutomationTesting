package dropdownhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTaskValidation {

	public static void main(String[] args) {
		//set  browser driver executable path using System.setProperty(keys,values)
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create an instance of chrome browser
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//enter URL
		driver.get("https://demo.actitime.com");
		
        WebElement userNameInputField=driver.findElement(By.id("username"));
        userNameInputField.sendKeys("admin");
        
        WebElement passwordInputField=driver.findElement(By.name("pwd"));
        passwordInputField.sendKeys("manager");
        
        WebElement loginButton=driver.findElement(By.id("loginButton"));
        loginButton.click();
        
        driver.findElement(By.id("container_tasks")).click();
        
        List<WebElement> taskName=driver.findElements(By.cssSelector(".taskRowsTable .names .title"));
        //create a list to store all the name coming from UI
        List<String> taskList=new ArrayList<String>(); 
        //using for loop trying to add one by one task name in above collection
        for(WebElement task:taskName) {
        	taskList.add(task.getText());
        }
        //validate task list is newly created task or not
        System.out.println(taskList.contains("3D modelling"));
	}

}
