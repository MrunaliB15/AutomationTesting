package Interface;

interface showable{
	//public void show(); // when  call show then print show
	public void print();
}
interface printable{
	//int age=23;
	void print();
}
public class interface3 implements showable,printable {
	//public static int age=35; //to call int print int 
	//public void show() {
		//System.out.println("hello show");  // when  call show then print show
	//}
	public void print() {
		System.out.println("welcome print");
	}

	public static void main(String[] args) {
		interface3 obj=new interface3();
		//obj.show(); // when  call show then print show
		obj.print();
		showable s=new interface3();
		//s.show();  // when  call show then print show
		s.print();
		printable p=new interface3();
		p.print();
		//System.out.println(interface3.age);
		//System.out.println(printable.age);
	}

}
