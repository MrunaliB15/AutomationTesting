package keyboardAndMouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReuableFunction {
   static WebDriver driver=null;
	public static void main(String[] args) {
		driver=setUp("chrome", "https://www.google.com");
		System.out.println(driver.getTitle());
		cleanUp();
		}

	static WebDriver setUp(String browserName,String url ) {
    	   
    	   String exePath;
    	   if(browserName.equalsIgnoreCase("chrome")) {
    		  exePath=System.getProperty("User.dir")+".\\drivers\\chromedriver.exe";
    		   //setting the path for driver executable
    		  System.setProperty("Webdriver.chrome.driver",exePath);
    		  //creating an instance of chrome browser and up casting it to web driver
    		  driver=new ChromeDriver();
    	   }else if(browserName.equalsIgnoreCase("firefox")) {
    		   exePath=System.getProperty("User.dir")+".\\drivers\\geckodriver.exe";
    		   //setting the path for driver executable
    		   System.setProperty("webdriver.gecko.driver",exePath);
    		   //creating an instance of firefox browser and up casting it to web driver
    		   driver=new FirefoxDriver(); 
    	   }
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	   //to enter required application URL use get() of webDriver interface
    	   driver.get(url);
    	   return driver;
       }
	static void cleanUp() {
		driver.close();
	}
}
