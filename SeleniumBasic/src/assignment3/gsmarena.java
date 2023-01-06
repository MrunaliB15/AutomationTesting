package assignment3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena {

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
        System.out.println("home page validation: "+homePage.equals("gsmarena"));
        //list
        List<WebElement>  phones=driver.findElements(By.cssSelector("aside>div>ul>li>a"));
        System.out.println("no. of brands: "+phones.get(0).getText());
        for(int i=0;i<phones.size();i++) {
        	System.out.println("phones"+i+":"+phones.get(i).getText());
        }
	}

}


//homePage.getTitle().equals("GSMARENA")