package Operator;

public class Unaryop {

	public static void main(String[] args) {
		
		int a=15;
		int b=a;
		System.out.println("a: "+a);//15
		System.out.println("b: "+b);//15
		int l=++a;
		System.out.println("l: "+l);//16
		System.out.println("a: "+a);//16
         int m = l++;
         System.out.println("l: "+l);//17
         System.out.println("m: "+m);//16
         
         int h=36;
         System.out.println("h: "+ h++);//36
         System.out.println("h: "+ h);//37
         System.out.println("h: "+ ++h);//38
         System.out.println("h: "+ h);//38
         
         int y= 201;
         System.out.println("y: "+ y--);//201
         System.out.println("y: "+ y);//200
         System.out.println("y: "+ --y);//199
         System.out.println("y: "+ y);//199
        		 
	}

}
