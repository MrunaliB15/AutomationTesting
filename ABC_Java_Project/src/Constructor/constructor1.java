package Constructor;

public class constructor1 {
	void constructor1()
	{
		System.out.println("this is zero parameter constructor");
	}
	public constructor1(char a)
	{
		System.out.println("constructor having single parameter");
	}
	constructor1(int num1, int num2)
	{
		System.out.println("constructor having int int  parameter");
	}
	constructor1(double num1, int num2)
	{
		System.out.println("constructor having double int  parameter");
	}
	constructor1(int num1, double num2)
	{
		System.out.println("constructor having int double  parameter");
	}
public static void main(String[] args) {
	//constructor1 c1 = new constructor1();
	constructor1 c2 = new constructor1(10,30);
	constructor1 c3 = new constructor1(20,30.4);
	constructor1 c4 = new constructor1('d');
	constructor1 c5 = new constructor1(30d,45);
}
}

	
