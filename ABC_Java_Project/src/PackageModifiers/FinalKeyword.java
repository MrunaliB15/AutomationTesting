package PackageModifiers;

public class FinalKeyword {
	final int x=10;
	final double PI= 3.14;

	public static void main(String[] args) {
		FinalKeyword myobj= new FinalKeyword();
		//myobj.x=50;  // x, PI declare as final so it can not assign value
		//myobj.PI=25;
		System.out.println(myobj.x);

	}

}
