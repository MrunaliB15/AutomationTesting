package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareTwoDate {
		public static void main(String[] args) throws ParseException {
			CompareDate("dd MM yyyy","28 12 2022","15 12 2022");
		}
		public static void CompareDate(String dateFormat, String d1, String d2) throws ParseException {
			SimpleDateFormat sdf=new SimpleDateFormat(dateFormat);
			//date to be compare
			Date date1=sdf.parse(d1);
			Date date2=sdf.parse(d2);
			//print date
			System.out.println("Date1: "+sdf.format(date1));
			System.out.println("Date2: "+sdf.format(date2));
			//compare date
			if(date1.compareTo(date2)>0) 
			{
				System.out.println("date 1 comes after date 2");
			}
			else if(date1.compareTo(date2)<0) 
			{
				System.out.println("date 1 comes before date2");
			}
			else if(date1.compareTo(date2)==0)
			{
				System.out.println("both date are equal");
			}
		}
}





