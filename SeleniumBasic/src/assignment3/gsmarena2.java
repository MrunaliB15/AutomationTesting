package assignment3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena2 {

	private static final By By = null;

	public static void main(String[] args) {
		//set browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create instance for chrome browser
        WebDriver driver=new ChromeDriver();
       //maximize
       driver.manage().window().maximize();
	   //implicit wait
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   //enter URL
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		//validate home page
		String homePage=driver.getTitle();
        System.out.println("home page validation: "+homePage.equals("GSMARENA"));
        //click on samsung link
        driver.findElements(By.linkText("samsung-phones-9.php"));
        //get device count and print 
       List<WebElement> DeviceCnt=driver.findElements(By.cssSelector("ul>li>a>strong>span"));
       System.out.println("device name: "+DeviceCnt.get(0).getText());
       for(int i=0;i<DeviceCnt.size();i++) {
    	   System.out.println("DeviceCnt :"+i+";"+DeviceCnt.get(i).getText());
       }
	}

}
