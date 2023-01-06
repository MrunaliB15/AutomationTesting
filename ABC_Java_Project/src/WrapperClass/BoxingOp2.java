package WrapperClass;

public class BoxingOp2 {

	public static void main(String[] args) {
		char c1='A';
		
		Character charobj1=new Character(c1);
		System.out.println(c1==charobj1);
		
		Character charobj2=new Character('Z');
		
		Character charobj3= 'G';
		
		System.out.println("c1: "+c1);
		System.out.println("charobj1: "+charobj1);
		System.out.println("charobj2: "+charobj2);
		System.out.println("charobj3: "+charobj3);
		
		boolean b=false;
		Boolean bobj=new Boolean(b);
		System.out.println(bobj==b);
	}

}
