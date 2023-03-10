package keyboardAndMouseOperations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.SeleniumUtility;

public class GetScreenshot {

	public static void main(String[] args) throws IOException {
		SeleniumUtility m1= new SeleniumUtility();
        WebDriver driver= m1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
        //type cast web driver instance into take screenshot interface
        TakesScreenshot ts=(TakesScreenshot)driver;
        //get screenshot using getScreenshotAs() of takesScreenshot() interface
        File file= ts.getScreenshotAs(OutputType.FILE);
        //store above screenshot into required location
        FileUtils.copyFile(file,new File(".\\screenshot\\vtiger.jpg"));
	}
}
 