package assignment2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic {

	public static void main(String[] args) {
		//set required browser driver executable path using System.setProperty(keys,values)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance of required browser class
		WebDriver driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//enter URL
		driver.get("https://www.techlistic.com");
        //maximize browser window
		driver.manage().window().maximize();
		//set required window size
		driver.manage().window().setSize(new Dimension(450,600));
		driver.manage().window().maximize();
		//click on java link
		driver.findElement(By.linkText("JAVA")).click();
		//page title
		String pageTitle=driver.getTitle();
		System.out.println("page title: "+pageTitle);
		System.out.println("page title validation: "+pageTitle.equals("Techlistic"));
		//back to home page
		driver.navigate().back();
		//click on BDD link
		driver.findElement(By.linkText("BDD")).click();
		//validate page title
		System.out.println("page title: "+driver.getTitle());
		System.out.println("page title validation: "+pageTitle.equals("Techlistic"));
		//back to home page
		driver.navigate().back();
		//click on testing link
		driver.findElement(By.linkText("TESTING")).click();
		System.out.println("page title validation: "+pageTitle.equals("Techlistic"));
		driver.close();
	}

}
