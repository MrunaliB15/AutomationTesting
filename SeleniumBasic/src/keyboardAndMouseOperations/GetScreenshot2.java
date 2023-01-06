package keyboardAndMouseOperations;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class GetScreenshot2 {

	public static void main(String[] args) {
		SeleniumUtility m1=new SeleniumUtility();
        WebDriver driver=m1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
      //type cast WebDriver instance into TakesScreenshot interface
         m1.takeScreenshot(".\\screenshot\\vtiger.jpg");
	}

}
