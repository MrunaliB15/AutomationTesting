package Casting;

class sample{
	double d=10;
	double test() {
		System.out.println("running test...");
		return 6;
	}
}

public class PrimitiveCasting4 {

	public static void main(String[] args) {
		System.out.println("program start..");
          sample s=new sample();
          int res=(int)s.test();  // explicit narrowing
          System.out.println("return value: "+res);
          System.out.println("program end..");
	}

}
