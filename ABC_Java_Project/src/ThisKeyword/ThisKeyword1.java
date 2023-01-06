package ThisKeyword;

public class ThisKeyword1 {
	int variable=51;

	public static void main(String[] args) {
		ThisKeyword1 obj = new ThisKeyword1();
		obj.method(20);
		obj.method();
		System.out.println("value of instance variable 1 : "+obj.variable);
	}
	
	
	void method(int variable) {
		System.out.println("the value of local variable: "+variable);
		variable=10;
		System.out.println("the value of local variable: "+variable);
		System.out.println("the value of instance variable 2 : "+this.variable);
		this.variable = variable;
		System.out.println("the value of local variable: "+variable);
		System.out.println("the value of instance variable 3 : "+this.variable);
	}
	void method() {
		int variable=40;
		System.out.println("the value of instance variable 4 : "+this.variable);
		System.out.println("the value of local variable: "+variable);
		this.variable=variable;
		System.out.println("the value of instance variable 5 : "+this.variable);
		System.out.println("the value of local variable: "+variable);
		
		
		

	}

}
