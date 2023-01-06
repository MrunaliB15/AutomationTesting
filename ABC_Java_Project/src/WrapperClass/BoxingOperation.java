package WrapperClass;

public class BoxingOperation {

	public static void main(String[] args) {
		int age=25;
		System.out.println("age: "+age);
		
		Integer obj=30;   //auto boxing
		System.out.println("obj: "+obj);
		 
		Integer obj1=new Integer(age);  //explicit boxing
		System.out.println("obj1: "+obj1);
		System.out.println(obj1==age);
		
		Integer obj2=new Integer(40);
		System.out.println("obj2: "+obj2);
		
		Integer obj3= new Integer(50);
		System.out.println("obj3: "+obj3);
		
		char c1='z';
		Character xyz=c1;
		Character cobj=new Character(c1);
		System.out.println(c1);
		System.out.println(xyz);
		System.out.println(cobj);
	}

}
