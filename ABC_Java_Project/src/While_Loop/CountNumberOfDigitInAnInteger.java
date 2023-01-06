package While_Loop;

public class CountNumberOfDigitInAnInteger {

	
	public static void main(String[] args) {
		System.out.println("program for Count Number Of Digit In An Integer");
		int num=142638,countDigit=0;
		while (num>0) 
		{
			num=num/10;
			countDigit++;
		}
		{
			System.out.println("No. of digit in a number "+ num + "  is  " + countDigit);
		}
	}
}
			
		


		


