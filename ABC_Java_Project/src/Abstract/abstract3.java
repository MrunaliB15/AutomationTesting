package Abstract;
 
abstract class shape{
	abstract void draw();
}
class triangle extends shape{
	void draw() {
		System.out.println("drawing triangle");
	}
}
class square extends shape{
	void draw() {
		System.out.println("drawing square");
	}
}
public class abstract3 {

	public static void main(String[] args) {
		shape s1 =new triangle();
		s1.draw();
		System.out.println("**********");
		shape s2=new square();
	      s2.draw();
	}

}
