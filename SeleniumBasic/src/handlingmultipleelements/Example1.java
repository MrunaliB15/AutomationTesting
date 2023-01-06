package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		//set browser driver executable path using System.setProperty(keys,values)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe ");
        //create instance of chrome Browser
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Enter URL
		driver.get("https://demo.automationtesting.in/Register.html");
		//link present in page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("link count: "+links.size());
		List<WebElement> inputFields=driver.findElements(By.tagName("input"));
		System.out.println("input field count: "+inputFields.size());
		
		List<WebElement> classObject=driver.findElements(By.cssSelector(".ng-pristine"));
		System.out.println("class object count: "+classObject.size());
		//in order to get specific element from list use get(index)
		classObject.get(1).sendKeys("admin");
		classObject.get(2).sendKeys("manager");
		classObject.get(3).sendKeys("Deccan Pune");
		classObject.get(4).sendKeys("abc@gmail.com");
	}

}
