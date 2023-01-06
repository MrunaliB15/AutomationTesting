package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		System.out.println("program start here..");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size= sc.nextInt();
		int[] empIds=new int[size];
		try {
			System.out.println(empIds[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("program ends here..");
	}

}
