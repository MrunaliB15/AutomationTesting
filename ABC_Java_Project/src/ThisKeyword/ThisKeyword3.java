package ThisKeyword;

public class ThisKeyword3 {
	int variable=5;
   int age=10;

	public static void main(String[] args) {
		
		ThisKeyword3 obj=new ThisKeyword3();
		obj.method(20);
		obj.method();
		System.out.println("obj GV variable: "+obj.variable);
		ThisKeyword3 obj2=new ThisKeyword3();
		System.out.println("obj2 GV variable: "+obj2.variable);
	}
	void method(int variable) {
		System.out.println("value of variable: "+variable);
		System.out.println("GV variable: "+this.variable);
		this.variable=variable;
		System.out.println("the value of variable: "+variable);
		System.out.println("GV variable: "+this.variable);
	}
	void method() {
		int variable=40;
		System.out.println("the value of variable: "+variable);
	}
}
		
		

	


