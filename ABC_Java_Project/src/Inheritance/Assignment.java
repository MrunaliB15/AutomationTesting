package Inheritance;
//parent class
class Company{
	int a=13;
	void method() {
		System.out.println("method having no parameter");
		this.method(1);
	}
	void method(int a) {
		System.out.println("method having int parameter ");
	}
	void Company(){
		System.out.println("constructor having no parameter");
		this.Company();
	}
	Company(int b){
		System.out.println("constructor having int parameter");
	}
}
//child class
class Employee extends Company{
	int Company=12;
	void method() {
		System.out.println("child method having no para.");
		this.method(1);
	}
	void method(int c) {
		System.out.println("child method having int para.");
	}
	void Employee(){
		System.out.println("child cons.having no para.");
		this.Employee();
	}
	 Employee(int d){
		System.out.println("child class having int para.");
	}
}
class Assignment{
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.method();
		e1.method(int c);
		e1.Employee();
	}
}
