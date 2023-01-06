package FibonacySeries;

public class Fabonacy {

	public static void main(String[] args) {
		int num1=0,num2=1,total,i,count=10;
		System.out.println("count we want"+count);
		System.out.println("fabonacy series is ");
		System.out.println(num1+ "   "+num2); //num1=0,num2=1
		for(i=2;i<count;++i)  // loop start from 2 because 0 and 1 are already printed
		{
			total=num1+num2;
			System.out.println("  "+total);
			num1=num2;    //swaping the values from num1 to num2
			num2=total;   // swaping the value from num2 to total
		}

	}

}
