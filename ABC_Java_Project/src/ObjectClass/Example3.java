package ObjectClass;

class ObjDemo{
	void display() {
		System.out.println("display of class ObjDemo...");
	}
}

public class Example3 extends ObjDemo{
	static int last_roll;
	int roll_no=56;
	Example3(){
		roll_no=last_roll;
		roll_no++;
	}
	 @Override
	 void display() {
		 System.out.println("display of object class...");
	 }
	 @Override
	public int hashCode(){
	 return roll_no;
	 }

	public static void main(String[] args) {
		Example3 ex1=new Example3();
		System.out.println(ex1);
		System.out.println(ex1.toString());
		System.out.println("hashCode() value of object class is: "+ex1.hashCode());
		ex1.display();
		System.out.println("-----------");
		ObjDemo d= new ObjDemo();
		System.out.println(d);
		System.out.println("hashCode() value from ObjDemo is: "+d.hashCode());

	}

}
