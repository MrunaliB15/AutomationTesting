package dropdownhandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) {
		//set  browser driver executable path using System.setProperty(keys,values)
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create an instance of chrome browser
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
        //***identified drop down list
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		//create an instance of select class and pass above element into constructor
		Select selectSkill=new Select(skillDropdown);
		//check whether drop down is multiselect drop down or not
		System.out.println("is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		//get default or already select option
//       WebElement selectedOption=selectSkill.getFirstSelectedOption();
//		String selectedOptionName=selectedOption.getText();
//		System.out.println("Already selected option name: "+selectedOptionName);
		                   //OR
		System.out.println("Already selcted option name: "+selectSkill.getFirstSelectedOption().getText());
		//get option count
		List<WebElement> options= selectSkill.getOptions();
		System.out.println("option count: "+options.size());
		//get drop down option name
		for(int i=0; i<options.size(); i++) {
			System.out.println("Options"+i+":"+options.get(i).getText());
		}
		//select option from drop down
		selectSkill.selectByIndex(4);
		System.out.println("already select by option name: "+selectSkill.getFirstSelectedOption().getText());
		         //OR
		selectSkill.selectByValue("Backup Manegment");
		System.out.println("Already select by option name: "+selectSkill.getFirstSelectedOption().getText());
		       //OR
		selectSkill.selectByVisibleText("Analytic");
		System.out.println("Already selected by option name: "+selectSkill.getFirstSelectedOption().getText());
		
		//changing the order of skills
		String act_skillName="";
		//get drop down option name
		for(int i=0;i<options.size(); i++) {
			if(options.size()-1!=i) {
				act_skillName=act_skillName+options.get(i).getText()+",";
			}else {
				act_skillName=act_skillName+options.get(i).getText();
			}
		}
		//Expected skills
		String exp_skillName="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
		System.out.println("skill name: "+act_skillName);
		System.out.println("exp skill name: "+exp_skillName);
		System.out.println("skill are in sorted order or nor: "+act_skillName.equals(exp_skillName));
		
		// 1. Year(ascending order validation)
		// 2. Month(month Sequence validation)
		// 3. Days(ascending order validation)
		Select dayDrop=new Select(driver.findElement(By.id("dayDrop")));
		List<Integer> days=new ArrayList<Integer>();
		for(int i=0; i<dayDrop.getOptions().size();i++) {
			String day= dayDrop.getOptions().get(i).getText();
					days.add(Integer.parseInt(day));
		}
		List<Integer> Dupdays= new ArrayList<Integer>(days);
		//dupDays addAll(days)
		Collections.sort(Dupdays);
		System.out.println(days.equals(Dupdays));
	}

}
