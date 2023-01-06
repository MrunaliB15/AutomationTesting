package ConstructoOverloading;

public class ConsOverloading1 {
	int rollno;
	double fee;
	ConsOverloading1(){
		System.out.println("zero parametiresed constructor");
		System.out.println("having no parameter");
	}
	ConsOverloading1(int a){
		System.out.println("having int parameter");
		rollno=a;
	}
	ConsOverloading1(double b){
		System.out.println("having double parameter");
		fee=b;
	}
	ConsOverloading1(int a, double b){
		System.out.println("having int,double  parameter");
		rollno=a;
		fee=b;
	}
	
	public static void main(String[] args) {
		ConsOverloading1 c1 = new ConsOverloading1();
		System.out.println("having no parameter= "+c1.rollno);
		System.out.println("having no parameter= "+c1.fee);
		System.out.println("=========================");
		ConsOverloading1 c2 = new ConsOverloading1(20);
		System.out.println("having int parameter= "+c2.rollno);
		System.out.println("having int parameter= "+c2.fee);
		System.out.println("==========================");
		ConsOverloading1 c3 = new ConsOverloading1(10000.0);
		System.out.println("having double parameter= "+c3.rollno);
		System.out.println("having double parameter= "+c3.fee);
		System.out.println("============================");
		ConsOverloading1 c4 = new ConsOverloading1(20,10000.0);
		System.out.println("having int,double   parameter= "+c4.rollno);
		System.out.println("having int,double  parameter= "+c4.fee);
		
	}
}
