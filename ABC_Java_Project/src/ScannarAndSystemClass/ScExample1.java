package ScannarAndSystemClass;
 import java.util.Scanner;
 
public class ScExample1 {

	public static void main(String[] args) {
		String s=" hello this is basic java";
		//Create scanner obj and pass string to it
           Scanner scan=new Scanner(s);
          System.out.println("boolean result: "+scan.hasNext());
          System.out.println("String: "+scan.nextLine());
           scan.close();
           
           System.out.println(".......Enter Details......");
           Scanner in= new Scanner(System.in);
           System.out.println("Enter Name : ");
           String name= in.next();
           System.out.println("Name : "+name);
           System.out.println("Enter Age : ");
           int i=in.nextInt();
           System.out.println("Age : "+i);
           System.out.println("Enter salary: ");
           double d=in.nextDouble();
           System.out.println("Salary : "+d);
           in.close();
	}
}
