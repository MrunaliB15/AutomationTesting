package Interface;

 interface drawable2{
	 void draw();
	 default void msg() {
		 System.out.println("default method");
	 }
	 static int cube(int x) {
		 return x*x*x;
	}
 }
 class Rectangle1 implements drawable2{
	 public void draw() {
		 System.out.println("drawing rectangle");
	 }
 }
public class interfaceDefaltStatic {

	public static void main(String[] args) {
		drawable2 d=new Rectangle1();
		d.msg();
         d.draw();
         System.out.println(drawable2.cube(35));
	}

}
