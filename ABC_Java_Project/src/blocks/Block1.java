package blocks;

public class Block1 {

	
		/* non-static block or IIB */
		{
			System.out.println("running non-static-block1 of class Blocks1..");
		}
		public static void main(String[] args) {
			System.out.println("main() Starts");
			Block1 b1 = new Block1();
			System.out.println("---------------------------------");
			Block1 b2 = new Block1();
			System.out.println("main() ends");
	}

}
