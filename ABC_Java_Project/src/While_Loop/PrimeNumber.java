package While_Loop;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i=17 , count=0, n=1;
		System.out.println ("no is: "+i);
		while (n<=i)
		{
			if (i%n==0)
				count=count+1;
				n=n+1;
		}
		{
			if (count==2)
				{
				System.out.println ("no.is prime");
				}
		
		else {
			System.out.println ("no.is not prime");
		}
				
		}
	}
}

	
	
		
	
