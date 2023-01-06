package ScannarAndSystemClass;

import java.util.Scanner;

public class ScExample2 {

	public static void main(String[] args) {
		int Age=23;
		System.out.println("Age: "+Age);
         Scanner scnObj=new Scanner(System.in);
         
         int pin;
         double salary;
         char grade;
         boolean status;
         System.out.println("Enter pin number: ");
         pin= scnObj.nextInt();
         System.out.println("salary: ");
         salary=scnObj.nextDouble();
         System.out.println("Enter grade: ");
         grade=scnObj.next().charAt(0);
         System.out.println("Enter status: ");
         status=scnObj.nextBoolean();
         System.out.println(pin+" \n"+salary+"\n"+grade+"\n"+status);
         
         System.out.println("Enter Name: ");
          String name=scnObj.next();
          System.out.println("Name: "+name);
         
          System.out.println("Enter Address: ");
          String address=scnObj.nextLine();  //
          System.out.println(" Address: "+address);
	}

	
}

