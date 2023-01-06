package Mock;

public class ReverseANumber {

	public static void main(String[] args) {
		int i=678, rev=0;
		System.out.println("the given no. is: "+i);
		for(i=678;i>0;)
		{
			rev=(rev*10)+i%10;
			i=i/10;
			{
			System.out.println("reverse no. is: "+rev);
			}
		}
		return;
		
	}

}
