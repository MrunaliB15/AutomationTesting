package WrapperClass;

final class ImmutableClass {
	
	String name;
	int salary;
	  
	ImmutableClass(String s1, int num) {
		name=s1;
		salary=num;	
	}
	public String getname() {
		return name;
	}
	
	public int getsalary() {
		return salary;
	}
	
	public static void main(String[] args) {
		ImmutableClass c1=new ImmutableClass("Mayuri", 35000);
	    System.out.println(c1.getname());
	    System.out.println(c1.getsalary());
	    //values has been changed so it will created new object
	    ImmutableClass c2= new ImmutableClass("Mayur",34000);
	    System.out.println(c2.getname());
	    System.out.println(c2.getsalary());
	}

}
