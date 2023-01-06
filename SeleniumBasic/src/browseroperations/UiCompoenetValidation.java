package browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiCompoenetValidation {

	public static void main(String[] args) {
		//set required browser driver executable path using System.setProperty(keys,values)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance of required browser class
		WebDriver driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter URL
		driver.get("https://demo.automationtesting.in/Register.html");
		//identify first name input field
		WebElement firstNameInputField=driver.findElement(By.className("ng-touched"));
		/*
		 * visible --- isDisplayed()
		 * Editable--- isEnabled()
		 * Default value- getAttribute(String attributename)
		 */
		System.out.println("first name input field visible or not? "+firstNameInputField.isDisplayed());
		System.out.println("first name input field editable or not? "+firstNameInputField.isEnabled());
		String firstNameInputFieldValue= firstNameInputField.getAttribute("placeholder");
		System.out.println("Default value validation status: "+firstNameInputFieldValue.equals("firestName"));
		
		//identify male radio button
		WebElement maleRadioBtn=driver.findElement(By.name("radioopetions"));
		/*
		 * visible
		 * Functional 
		 * by default should not be selected
		 * select and verify, now its selected or not
		 */
		System.out.println("male radio button visible or not? "+maleRadioBtn.isDisplayed());
		System.out.println("male radio button functional or not? "+maleRadioBtn.isEnabled());
		System.out.println("male radio button default section status "+maleRadioBtn.isSelected());
         maleRadioBtn.click();
         System.out.println("after selection,male radio button selection status "+maleRadioBtn.isSelected());
        
		//identify submit button
         WebElement submitBtn=driver.findElement(By.id("submitBtn"));
		
         /*
 		 * visible --- isDisplayed()
 		 * Functional--- isEnabled()
 		 * Default value- button name is coming from inner HTML text, so we will be using getText()
 		 */
         System.out.println("submit button visible or not? "+submitBtn.isDisplayed());
         System.out.println("submit button functional or not? "+submitBtn.isEnabled());
         String actualButtonName=submitBtn.getText().trim();
         System.out.println("submit button name validation status: "+actualButtonName.equals("Submit"));
	}

}
