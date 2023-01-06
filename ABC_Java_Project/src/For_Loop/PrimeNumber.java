package For_Loop;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=13,i,count=0;
		System.out.println("the no. is: "+a);
		for ( i=1;i<=a;i++)
		{
			if (a%i==0)
				count++;
		}
		
		{
			if (count==2)
				{
				System.out.println("no. is prime ");
				}
			else
			{
				System.out.println("no. is not prime ");
			}
				
		}
				
	}
			
}

	
		
			

		
			
		

	


