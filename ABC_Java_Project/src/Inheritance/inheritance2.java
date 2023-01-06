package Inheritance;

class fourwheeler{
	public void wheels() {
		System.out.println("i have 4 wheel");
	}
}
class car extends fourwheeler{
	public void type() {
		System.out.println("i am car");
	}
}
class maruti extends car{
	public void company() {
		System.out.println("i am maruti");
	}
}
public class inheritance2 {

	public static void main(String[] args) {
		maruti mr=new maruti();
		mr.wheels();
		mr.company();
		mr.type();

	}

}
