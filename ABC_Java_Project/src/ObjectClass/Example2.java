package ObjectClass;

public class Example2 extends Demo{
	static int last_roll=55;
	int roll_no;
	
	Example2(){
		last_roll=roll_no;
		roll_no++;
	}

	public static void main(String[] args) {
		Example2 ex=new Example2();
		System.out.println(ex);
		System.out.println(ex.toString());
		System.out.println(ex.hashCode()); // hashCode convert hexadecimal address in decimal and return value
		System.out.println("--------------");
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
	}

}
