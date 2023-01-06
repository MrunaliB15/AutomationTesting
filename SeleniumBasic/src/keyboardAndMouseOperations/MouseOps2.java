package keyboardAndMouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOps2 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
		driver.get("https://www.globalsqa.com/demo-site/");
		//identify all the elements of main menu
		List<WebElement> mainMenu=driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("main menu option count: "+mainMenu.size());
		//create an instance of Action class by passing required browser instance to its constructor
		Actions act=new Actions(driver);
		/**to do hover over the Home option*/
//		act.moveToElement(mainMenu.get(2)).perform();
		/**to do hover in all main menu option*/
//		for(int i=0;i<mainMenu.size();i++) {
//		WebElement option=mainMenu.get(i);
//		act.moveToElement(option).perform();
//			Thread.sleep(1000);
//		}
		/**Mouse hover using reusable function/method*/
//		mouseHoverOverInTheElement(act,mainMenu.get(2));
//		mouseHover(act,mainMenu);
		/** mouse hover with chord*/
//		act.moveToElement(mainMenu.get(2),100,0).perform();
		/**mouse hover with chord using reusable function*/
//		mouseHoverWithChord(mainMenu.get(1),100,0).perform();
		/**Right click on required element*/
		rightClick(act,mainMenu.get(1));
		}
        
	   static void mouseHoverOverInTheElement(Actions act,WebElement element) {
	   act.moveToElement(element).perform();
	   }
	   
	   static void rightClick(Actions act,WebElement options) {
		   System.out.println("options name is: "+options.getText());
		   act.moveToElement(options).contextClick().build().perform();
		// act.contextClick(option).build().perform();
	   }
		   
		static void mouseHoverWithChords(Actions act,WebElement options, int x, int y ) {
			System.out.println("options name is: "+options.getText());
			act.moveToElement(options, x,y).perform();
		}
		static void mouseHover(Actions act, List<WebElement> mainMenu) throws InterruptedException {
			for(int i=0;i<mainMenu.size();i++) {
				WebElement options= mainMenu.get(i);
				act.moveToElement(options).perform();
				Thread.sleep(1000);
			}
	   }
}
