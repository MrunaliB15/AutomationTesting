package Interface;

interface printable2{
	void print();
}
interface Showable2{
	void print();
}
class interface4 implements printable2,Showable2{
	public void print() {
	System.out.println("Hello");
	}
	public static void main(String args[]) {
	   interface4 obj=new interface4();
	   obj.print();
	   printable2 obj1=new interface4();
	   obj1.print();
	   Showable2 obj2=new interface4();
	   obj2.print();
	}
	
}


	
