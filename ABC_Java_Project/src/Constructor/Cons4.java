package Constructor;

 class Cons0 {
	int i=20;
	Cons0(){
		System.out.println("class Cons4 constructor");
		i=25;
	}
}
 public  class Cons4 {
	 
	public static void main(String[] args) {
		System.out.println("main() of cons4 is started");
		Cons0 c1 = new Cons0();
		System.out.println("class Cons0 global variable = "+c1.i);
		System.out.println("========================================");
		Cons0 c2 = new Cons0();
		System.out.println("class Cons0 global variable = "+c2.i);
		System.out.println("main() of cons4 is end");
	}
 }

