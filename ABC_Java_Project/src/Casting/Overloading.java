package Casting;

 class shape{
	 public void area() {
	 System.out.println("my area");
 }
 public void area(int r) {
	 System.out.println("area of circle: "+3.14*r*r);
 }
 public void area(double b, double h) {
	 System.out.println("area if triangle: "+0.5*b*h);
 }
 public void area (int l, int b) {
	 System.out.println("area of rectangle: "+l*b);
 }
 }
public class Overloading {

	public static void main(String[] args) {
		shape s= new shape();
		s.area();
        s.area(50);
        s.area(6.1, 1.4);
        s.area(7,3);
	}

}
