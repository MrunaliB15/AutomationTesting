package Interface;

  interface drawable{
	 int salary=25000;
	 void draw();
 }
  
  class Rectangle implements drawable{
	 public void draw() {
		 System.out.println("drawing rectangle");
	  }
  }
  class circle implements drawable{
	  public void draw() {
		  System.out.println("drawing circle");
	  }
  }
public class Interface1 {

	public static void main(String[] args) {
		System.out.println("interface variable salary: "+drawable.salary);
		Rectangle r=new Rectangle();
		r.draw();
		System.out.println("**********");
		circle c= new circle();
		c.draw();
		System.out.println("***********");
		drawable d=new circle();
		d.draw();
	}

}
