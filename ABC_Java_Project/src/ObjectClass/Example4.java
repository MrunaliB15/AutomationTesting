package ObjectClass;

class sample{
	void call() {
		System.out.println("call() of sample class..");
	}
}
public class Example4 extends sample{
	static int last_roll;
	int roll_no;
	Example4(){
		roll_no=last_roll;
		roll_no++;
	}
	@Override
	public int hashCode() {
		return 403;
	}
	@Override
	public String toString(){
		return"basicCoreJava";
	}

	public static void main(String[] args) {
		Example4 e=new Example4();
		System.out.println(e);
		System.out.println(e.hashCode());
		System.out.println("------------");
		sample s=new sample();
		System.out.println(s);
		System.out.println(s.hashCode());
	}

}
