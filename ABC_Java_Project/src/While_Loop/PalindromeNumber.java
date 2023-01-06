package While_Loop;

public class PalindromeNumber {

	public static void main(String[] args) {
		int i=242,rev=0,n=242;
		System.out.println("no.is: "+i);
		
		while (i>0)
		{
			rev=(rev*10)+i%10;
			i=i/10;
		}
		if (rev==n)
		{
			System.out.println("no. is palindrome ");
		}
		else 
		{
			System.out.println("no. is not palindrome");
		}

	}

}
