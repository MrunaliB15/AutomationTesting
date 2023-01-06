package dropdownhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripCalender {

	public static void main(String[] args) {
		//set browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance of Chrome browser
        WebDriver driver=new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //enter URL
        driver.get("https://www.makemytrip.com/");
        
	}

}
