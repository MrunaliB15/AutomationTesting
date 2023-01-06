package Methodoverloading;

public class Method {
	float a=34.4f;
	int add(int num1,int num2) {
	return (num1+num2);
	}

	public static void main(String[] args) {
		Method m1=new Method();
		System.out.println("a: "+m1.a);
		int sum=m1.add(23, 32);
		System.out.println("sum: "+sum);
	}
}
				
		

	


