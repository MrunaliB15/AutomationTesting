package handlingmultipleelements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategoriesWithFindElements {

	public static void main(String[] args) {
		//set driver executable path using System.setProperty(keys,values);
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance of chrome Browser
		WebDriver driver= new ChromeDriver();
		//maximize 
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //enter URL
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement> categories = driver.findElements(By.cssSelector(".list-group>a"));
		System.out.println("Option count is: "+categories.size());
		//creating expected result list
		List<String> expectedCat= new ArrayList<String>();
		expectedCat.add("CATEGORIES");
		expectedCat.add("phones");
		expectedCat.add("laptops");
		expectedCat.add("Monitors");
		//logic to get one by one element from the list and performing validation on that
		for(int i=0; i<categories.size(); i++) {
			WebElement cat= categories.get(i);
			System.out.println("****Element of list is: "+cat.getText()+"******");
			System.out.println(cat.isDisplayed());
			System.out.println(cat.isEnabled());
			System.out.println(cat.getText().equals(expectedCat.get(i)));
		}
	}

}
