package blocks;

public class Blocks2 {

		Blocks2(){
			System.out.println("zero-param cons...");
		}	
		/* non-static block or IIB*/
		{
			System.out.println("running non-static-block-1 of class Blocks2..");
		}	
		public static void main(String[] args) {
			System.out.println("main() Starts");
			Blocks2 b1=new Blocks2();
			System.out.println("---------------------------------");
			Blocks2 b2=new Blocks2();
			System.out.println("main() ends");
		}	
		/* non-static block or IIB*/
		{
			System.out.println("running non-static-block-2 of class Blocks2..");
		}	
	}


	
