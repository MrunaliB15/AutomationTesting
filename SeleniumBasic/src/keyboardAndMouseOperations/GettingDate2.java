package keyboardAndMouseOperations;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GettingDate2 {

	public static void main(String[] args) {
		//get calendar class instance
		Calendar cal= Calendar.getInstance();
        // add number of days(+/-) based on your requirement
		cal.add(Calendar.DATE,-3);
		//date class will get you current system date
		Date d1=new Date(cal.getTimeInMillis());
		//SimpleDateFormat will help you to get specific format
		SimpleDateFormat s=new SimpleDateFormat();
		//with the help of SimpleDateFormat you can convert your date into required format
		System.out.println(s.format(d1));
	}

}
