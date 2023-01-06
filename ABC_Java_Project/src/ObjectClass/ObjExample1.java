package ObjectClass;

class Demo{
	void display() {
		System.out.println("i am dispaly()....");
	}
}

public class ObjExample1 extends Demo{
	static int last_roll=45;
	int roll_no;
	ObjExample1(){
		roll_no=last_roll;
		last_roll++;
	}
	

	public static void main(String[] args) {
		ObjExample1 ex= new ObjExample1();
		System.out.println(ex);
		System.out.println(ex.toString());   //String is representation of an objectroll_no=last_roll;
		System.out.println("************");
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println("************");
		Demo d2= new Demo();
		System.out.println(d2.toString());
		System.out.println("***********");
		Demo d3= new ObjExample1();
		System.out.println(d3);
	}

}
