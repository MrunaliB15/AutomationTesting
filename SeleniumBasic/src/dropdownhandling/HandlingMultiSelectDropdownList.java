package dropdownhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdownList {

	public static void main(String[] args) {
		//set  browser driver executable path using System.setProperty(keys,values)
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create an instance of chrome browser
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
		
		//identified drop down list
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
        //create an instance of select class and pass above element into its constructor
		Select selectSkill=new Select(carDropdown);
		//**** check whether drop down is multiselect drop down or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		//**** get default or already select option
		System.out.println("Already selectec option name: "+selectSkill.getFirstSelectedOption().getText());
		 //get option count
		List<WebElement> options= selectSkill.getOptions();
		System.out.println("option count: "+options.size());
		//Get dropdown option names
		for(int i=0; i<options.size();i++) {
			System.out.println("options "+i+":"+options.get(i).getText());
		}
		//select options from dropdown
		selectSkill.selectByIndex(0);
		selectSkill.selectByIndex(2);
		selectSkill.selectByIndex(3);
		
		//get all selected option
		List<WebElement> selectCars=selectSkill.getAllSelectedOptions();
		System.out.println("Selected car count: "+selectCars.size());
		
		//un select already select options
		selectSkill.deselectAll();
	}

}
