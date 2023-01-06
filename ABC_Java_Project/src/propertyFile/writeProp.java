package propertyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writeProp {

	public static void main(String[] args) throws IOException   {
		System.out.println("program start");
		FileInputStream fis=new FileInputStream(".\\MyProp\\Text.Properties");
		Properties prop=new Properties();
		prop.load(fis);
		prop.setProperty("Positions", "Softwere Tester");
		prop.setProperty("Name", "Mrunali");
		prop.setProperty("Lname", "Bhasme");
		prop.setProperty("Location", "Hinganghat, Wardha");
		
		System.out.println(prop.get("Position"));
		System.out.println(prop.get("Name"));
		System.out.println(prop.get("Lname"));
		System.out.println(prop.get("Address"));
		
		FileOutputStream fos= new FileOutputStream(".\\MyProp\\Text.Properties");
		
		prop.store(fos, "My data");
		fos.flush();
		fos.close();
		System.out.println("program end");

	}

}
