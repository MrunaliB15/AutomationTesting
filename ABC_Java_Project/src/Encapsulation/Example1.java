package Encapsulation;

class testEncap{
	private int age=25;
	private double salary=45000;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public double getsalary() {
		return salary=salary;
	}
	public void setsalary(double salaray) {
		this.salary=salary;
	}
}

public class Example1 {

	public static void main(String[] args) {
		testEncap t1= new testEncap();
		System.out.println("age: "+t1.getAge());
		System.out.println("salary: "+t1.getsalary());
		System.out.println("*********************");
		t1.setAge(30);
         t1.setsalary(55000);
         System.out.println("age: "+t1.getAge());
         System.out.println("salary: "+t1.getsalary());
         System.out.println("***********************");
         testEncap t2= new testEncap();
         System.out.println("age: "+t2.getAge());
 		System.out.println("salary: "+t2.getsalary());
	}

}
