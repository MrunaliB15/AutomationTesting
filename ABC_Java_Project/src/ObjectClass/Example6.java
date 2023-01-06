package ObjectClass;

class print extends Object{
	int a=30;
	@Override
	public int hashCode() {
		return 298;
	}
	@Override
	public String toString() {
		return "print class toString";
	}
	@Override
	public boolean equals(Object obj) {
	print p= (print)obj;
		return (this.a==p.a);
	}
	
	
}
public class Example6 {
	static int last_roll;
	int roll_no;
	Example6(){
		roll_no=last_roll;
		roll_no++;
	}

	public static void main(String[] args) {
		Example6 e=new Example6();
		System.out.println("e:toString of object class: "+e);
		System.out.println("e: hashCode of object class: "+e.hashCode());
		System.out.println("*************");
		Example6 e1= new Example6();
		System.out.println("e1: toString of object class: "+e1);
		System.out.println("e1: hashCode of object class: "+e1.hashCode());
		System.out.println("comparing e and e2: "+e.equals(e1));
		System.out.println("****************");
		Example6 e2=e1;
		System.out.println("comapring e1 and e2: "+e1.equals(e2));
		System.out.println("***************");
		print p=new print();
		System.out.println("toString of print class: "+p);
		System.out.println("hashCode of print class: "+p.hashCode());
		System.out.println("*****************");
		print p1= new print();
		System.out.println("toString of print class: "+p1);
		System.out.println("hashCode of print class: "+p1.hashCode());
		System.out.println("comparing print class object p and p1 : "+p.equals(p1));

	}

}
