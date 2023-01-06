package keyboardAndMouseOperations;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GettingDate {

	public static void main(String[] args) {
		// Date class will get you the current system date
		Date d1=new Date();
		//simpleDateFormat will help to get date in specific format
       SimpleDateFormat s1= new SimpleDateFormat();
       //with the help of SimpleDateFormat you can convert your date to required format
       System.out.println(s1.format(d1));
	}

}
