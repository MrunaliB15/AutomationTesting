package ImmutableClass;

public final class ImmutableEx1 {
	
	final String name;
	final double salary;
	ImmutableEx1(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	public String getname() {
		return name;
	}
	public double getsalary() {
		return salary;
	}
}

 class Sample1{
	public static void main(String[] args) {
		ImmutableEx1 Im=new ImmutableEx1("mumbai",15000);
		System.out.println(Im.getname());
		System.out.println(Im.getsalary());
		
		ImmutableEx1 Im2= new ImmutableEx1("pune",23980);
		System.out.println(Im2.getname());
		System.out.println(Im2.getsalary());
	}
}
	
	


