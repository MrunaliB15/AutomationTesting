package Methodoverloading;

public class Call {

	public static void main(String[] args) {
		System.out.println("it's call calss");
	}
}


public class Method1 {
	 double x=20,y=30,z=40;
	 boolean checkSameOrNot(int a,int b) {
	 return (a==b);
	 }
 static void display() {
	 Method1 m1=new Method1();
	 System.out.println("input the first number: "+m1.x);
	 System.out.println("input the second number: "+m1.y);
	 System.out.println("input the third number: "+m1.z);
 }
 public static void main(String[] args) {
	 System.out.println("its method class");
	 Method1 m2 = new Method1();
	 System.out.println("input the first number: "+m2.x);
	 System.out.println("input the second number: "+m2.y);
	 System.out.println("input the third number: "+m2.z);
	 m2.average(m2.x,m2.y,m2.z);
 
 boolean res=m2.checkSameOrNot(10,20);
 System.out.println(res);
 }
 public void average(double p, double q, double r)
 {
	 double res =(p+q+r)/3;
	 System.out.println("average is: "+res);
 }
}
 
	 
	 
	

	


