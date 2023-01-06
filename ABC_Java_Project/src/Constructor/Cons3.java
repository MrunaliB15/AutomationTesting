package Constructor;

public class Cons3 {
	int rollno;
	double fee;
	Cons3(int r, double f){
		rollno=r;
		fee=f;
	}
	void display()
	{
		System.out.println(rollno+ "  "+fee);
	}
	public static void main(String[] agrs) {
		Cons3 c1 = new Cons3(99,10000.0);
				c1.display();
		Cons3 c2 = new Cons3(101,12000.0);
		c2.display();
	}
}