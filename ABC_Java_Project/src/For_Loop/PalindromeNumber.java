package For_Loop;

public class PalindromeNumber {

	public static void main(String[] args) {
		int i=343,rev=0,n=343;
		System.out.println("the no. is: "+i);
		 
		for ( i=343;i>0;)   
		{
			rev=(rev*10)+i%10;
					i=i/10;
		}
		{
			if(rev==n)
			{
				System.out.println("no. is pallindrome");
			}
			else
			{
				System.out.println("no. is not pallindrome");
			}
		}
	}
}
		
		
