package For_Loop;

public class FactorsOfPositiveintiger {

	public static void main(String[] args) {
		System.out.println("factor of positive number");
		int num=12;
		for (int i=1;i<=num;++i)
		if ( num%i==0 )
		{
			System.out.print(i+" , ");
		}
	}
}
		