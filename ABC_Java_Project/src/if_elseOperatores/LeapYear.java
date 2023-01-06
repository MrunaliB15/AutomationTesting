package if_elseOperatores;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("program start for leap year");
		int a=2028;
		System.out.println("the given year is: "+a);
		if(a%4==0)
		{
			System.out.println("the given year is: "+a+"  this is leap year");
		}
		else
		{
			System.out.println("the given year is: "+a+"  this is ordinary year");
		}
		System.out.println("program end here");
	}

}
