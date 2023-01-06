package Abstract;

abstract class Animal{
	//abstract body (does not have body)
   public abstract void sound();
   //regular body
   public void sleep() {
	   System.out.println("zzzz");
   }
}

  class cat extends Animal{
    public void sound() {
    	System.out.println("cat say's meow meow");
    }
}
  class pig extends Animal{
	  public void sound() {
		  System.out.println("pig say's wee wee");
	  }
  }
public class Abstract1 {

	public static void main(String[] args) {
		cat c1=new cat();
		c1.sound();
        c1.sleep();
        pig p1=new pig();
        p1.sound();
        p1.sleep();
	}

}
    