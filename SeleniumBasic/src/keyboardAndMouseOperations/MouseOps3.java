package keyboardAndMouseOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOps3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//frame handling
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
        driver.switchTo().frame(frame);
        //create an instance of Action class by passing required browser instance to its constructor
        Actions act=new Actions(driver);
        //first identify source and target element for drag and drop
        List<WebElement> sourceElements=driver.findElements(By.cssSelector("ul#gallery>li"));
        WebElement target=driver.findElement(By.id("trash"));
        //perform drag and drop operation
//        act.dragAndDrop(sourceElements.get(0),target().build().perform();
//       Thread.sleep(1000) ; 
//        act.dragAndDrop(sourceElement,get(1),target(),build().perform());
//        Thread.sleep(1000);
//        act.dragAndDrop(sourceElement.get(2).target(),build(),perform();
         for(int i=0;i<sourceElements.size();i++) {
        	 performDragAndDrop(act,sourceElements.get(i),target);
         }
	}
	static void performDragAndDrop(Actions act,WebElement src,WebElement target) {
		act.dragAndDrop(src,target).build().perform();
	}

}
