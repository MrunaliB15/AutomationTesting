package Operator;

public class Unaryop3 {

	public static void main(String[] args) {
		int a=0,b;
		b= a++ + ++a + ++a +a;
		System.out.println("a is: "+a);
		System.out.println(a);
		System.out.println(b);
		System.out.println("*************");
		
		int c=1;
		b=c-- + --c + --c + c;
		System.out.println("c is: "+c);
		System.out.println(c);
		System.out.println(b);
		System.out.println("*******************");
		
		int d=2;
		b= --d + --d + --d + ++d + ++d +d;
		System.out.println("d is: "+d);
		System.out.println(d);
		System.out.println(b);
		System.out.println("*************");
		
		int e=3;
		b= e-- + e + ++e + e++ + ++e + e++ + e;
		System.out.println("e is: "+e);
		System.out.println(e);
		System.out.println(b);
		System.out.println("**************");
		
		int h=4;
	   b= h-- + h + ++h +h++ + ++h + h++ + h;
	   System.out.println("h is: "+h);
	   System.out.println(h);
	   System.out.println(b);
	  
				
				
				
		
				
		
		
		
				
		

	}

}
