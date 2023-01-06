package Inheritance;

class Chocolate{
	int chocolateAge;
		Chocolate(){
			super();
			System.out.println("chocolate class cons.");
			 chocolateAge=3;
		}
		public void taste() {
			System.out.println("chocolate are sweet");
	}
}
class mango extends Chocolate{
	int mangoAge;
	mango(){
		super();
		System.out.println("mango class cons.");
		 mangoAge=2;
	}
	public void shape() {
		System.out.println("mango chocolate are round");
	}
	public void taste() {
		System.out.println("mango chocolate are sweet");
	}
}
public class Inheritance7 {

	public static void main(String[] args) {
		System.out.println("******************");
		mango m1=new mango();
		m1.taste();
		m1.shape();
		System.out.println("mango Age:"+m1.mangoAge);
		System.out.println("****************");
        Chocolate c1=  new Chocolate();
        c1.taste();
        System.out.println("chocolate Age:"+c1.chocolateAge);
	}

}
