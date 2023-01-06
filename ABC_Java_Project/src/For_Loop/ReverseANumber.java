package For_Loop;

public class ReverseANumber {

	public static void main(String[] args) {
		int i=123,rev=0;
		System.out.println("the given no. is: "+i);
		for ( i=123;i>0;)
		{
			rev=(rev*10)+i%10;
			i=i/10;
		
			{
			System.out.println("the reverse no. is: "+rev);
			}
		}
		return ;
	}
}

        // rev= (0*10)+243%10;|3
         //i=243/10|24
         //rev=(3*10)+24%10|30+4=34
         //i=24/10|2
         // rev=(34*10)+2%10|340+2=342