package WrapperClass;

public class WrapperClassEx1 {

	public static void main(String[] args) {
		int a=30;
		
		Integer k=new Integer(a);
		Integer l=new Integer(30);
		Integer j=a;
		System.out.println("a: "+a+"\n k: "+k+"\n l: "+l+"\nj: "+j);
		
		System.out.println("***unboxing the boxed value****");
		Integer a1=new Integer(3);
		int i1=a1.intValue();   //unboxing
		System.out.println("a1: "+a1+"\n i1: "+i1);
		
		System.out.println("a1==i1: "+(a1==i1));
		System.out.println("a1.equals(i1): "+a1.equals(i1));
	}

}
