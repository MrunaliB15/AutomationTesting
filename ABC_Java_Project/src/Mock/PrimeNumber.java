package Mock;

public class PrimeNumber {

	public static void main(String[] args) {
		int x=15,i,count=0;
		System.out.println("the no.is="+x);
		for(i=1;i<=x;i++) {
			if (x%i==0);
			count++;
		}
		{
		if(count==2) {
			System.out.println("no. is prime");
		}
		else {
		System.out.println("no. is not prime");
		}
	}
}
}
 