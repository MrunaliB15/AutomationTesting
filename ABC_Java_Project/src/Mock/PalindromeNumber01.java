package Mock;

public class PalindromeNumber01 {

	public static void main(String[] args) {
		int i=454, rev=0, n=454;
		System.out.println("the no. is: "+i);
		for(i=454; i>0;) 
		{
			rev=(rev*10)+i%10;
			  i=i/10;
		}
		{
			if(rev==n) {
				System.out.println("no. is palindrome");
			}
			else {
				System.out.println("no. is not palindrome");
			}
		}
		
	}

}
