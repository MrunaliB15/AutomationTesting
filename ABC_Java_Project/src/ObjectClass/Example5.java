package ObjectClass;

class testsample{
	int a=20;
	@Override
	public int hashCode() {
		return 203;
	}
	@Override
	public String toString() {
		return "i am testsample class toString";
	}
}

public class Example5 {

	public static void main(String[] args) {
		Example5 s1=new Example5();
		System.out.println("s1:toString of object class: "+s1);
		System.out.println("s1: hashCode of object class: "+s1.hashCode());
		System.out.println("**************");
		Example5 s2= new Example5();
		System.out.println("s2: toString of object class: "+s2);
		System.out.println("s2: hashCode of object class: "+s2.hashCode());
		System.out.println("comparing s1 and s2: "+s1.equals(s2));
		System.out.println("*****************");
		Example5 s3=s2;
		System.out.println("comparing s2 and s3: "+s2.equals(s3));
		System.out.println("*****************");
		testsample t= new testsample();
		System.out.println("toString of print: "+(t));
		System.out.println("hashCode of print: "+t.hashCode());
		System.out.println("*****************");
		testsample t2= new testsample();
		System.out.println("toString of print: "+t2);
		System.out.println("hashCode of print: "+t2.hashCode());
		System.out.println("comparing print class object t and t2 with overriden equals: "+t.equals(t2));
	}

}
