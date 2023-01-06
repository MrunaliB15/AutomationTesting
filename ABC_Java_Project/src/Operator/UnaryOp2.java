package Operator;

public class UnaryOp2 {


	public static void main(String[] args) {
		
		int a=46, b;
		b= a++;
		int x= a,y;
		System.out.println("program start");
		System.out.println(x);
		y= ++x;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
		int p= -15,q=25;
		 int result = p++ + --q;
		System.out.println("res is: "+ result);
		System.out.println("p is: "+p);
		System.out.println("q is: "+q);
		
		System.out.println("*****************");
	     result = ++p + ++q;
	     System.out.println("res is: "+result);
	     System.out.println("p is: "+p);
	     System.out.println("q is: "+q);
	     
	     System.out.println("*********************");
	     result = --p + ++q;
	     System.out.println("res is: "+result);
	     System.out.println("p is: "+p);
	     System.out.println("q is: "+q);
	     
	     System.out.println("********************");
	     result = p-- + q++;
	     System.out.println("res is: "+result);
	     System.out.println("p is: "+p);
	     System.out.println("q is: "+q);
	    
	     System.out.println("*****************");
	     result = p++ + q--;
	     System.out.println("res is: "+result);
	     System.out.println("p is: "+p);
	     System.out.println("q is: "+q);
	    
	     System.out.println("program end");
	     
		
		
		
		

	}

}
