package Casting;

public class CompileTime {
	static void sum(int a, int b) {
	int c= a+b;
		System.out.println("addition of two number: "+c);
	}
	static void sum(int a, int b, int e) {
		int c=a+b+e;
		System.out.println("addition of three number: "+c);
	}

	public static void main(String[] args) {
		CompileTime.sum(34,54,56);

	}

}
