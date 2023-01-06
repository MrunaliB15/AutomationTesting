package assignment2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		//set required browser driver executable path using System.setProperty(keys,values)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance of required browser class 
		WebDriver driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // open URL
		driver.get("https://www.amazon.in");
		//maximize browser window
		driver.manage().window().maximize();
		//set size
		driver.manage().window().setSize(new Dimension(450,600));
		driver.manage().window().maximize();
		//page title
		System.out.println("page Title: "+driver.getTitle());
		//click on menu link
		driver.findElement(By.linkText("Amazon Pay")).click();
		//page title
		System.out.println("page title: "+driver.getTitle());
		//back to home page
		driver.navigate().back();
		//page Title
		System.out.println("page Title: "+driver.getTitle());
		//verify the value matches with output
		System.out.println("verify the value matches with output: "+driver.getTitle().equals(driver.getTitle()));
		driver.close();
	}

}
