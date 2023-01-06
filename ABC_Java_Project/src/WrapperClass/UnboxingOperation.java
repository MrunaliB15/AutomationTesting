package WrapperClass;

public class UnboxingOperation {

	public static void main(String[] args) {
		Double doubleObj=24.3456;      //unboxing
		System.out.println("doubleObj: "+doubleObj);
		
		double salary =doubleObj.doubleValue();  // unboxing
		System.out.println(salary);
		System.out.println(doubleObj==salary);
		
		Boolean b=true;     //boxing
		boolean b1=b.booleanValue(); //unboxing
		
		Character c1=new Character('a');
		char c2=c1.charValue();
		
		Integer i=25;
		double d=i.intValue();
	}

}
