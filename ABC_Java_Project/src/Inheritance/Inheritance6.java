package Inheritance;

class Fruit {
	int fruitAge;
	Fruit(){
		super();
		System.out.println("fruit class cons.");
		 fruitAge=8;
	}
	public void taste() {
		System.out.println("fruits are sweet");
	}
}
	class Orange extends Fruit{
		int fruitAge;
		Orange(){
			super();
			System.out.println("Orange class cons.");
			 fruitAge=5;
		}
		public void taste() {
			System.out.println("Orange are sweet");
		}
	
	public void shape() {
		System.out.println("orange is round");
		System.out.println("orange fruit Age: "+fruitAge);
		System.out.println("orange fruits Age: "+super.fruitAge);
		taste();
		super.taste();
	}
	
}
public class Inheritance6 {

	public static void main(String[] args) {
		System.out.println("******************");
		Orange o1=new Orange();
          o1.shape();
          System.out.println("***************");
	}

}
