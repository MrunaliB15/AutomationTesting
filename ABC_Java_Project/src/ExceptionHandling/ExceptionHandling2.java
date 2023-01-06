package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("Program start here...");
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fiest num1: ");
        i=sc.nextInt();
		System.out.println("Enter first num2: ");
		j=sc.nextInt();
		try {
			k=i/j;
			System.out.println("result: "+k);
		}
		catch(ArithmeticException obj) {
			obj.printStackTrace();
		}
		System.out.println("program ends here...");
	}

}
