package Encapsulation;

class Demo{
	private int EmpId=1000;
	private double salary= 45000;
	//getter method
	public int getEmpId() {
		return EmpId;
	}
	public double getsalary() {
		return salary;
	}
	//setter method
	public void setEmpId(int e) {
		this.EmpId=e;
		 System.out.println("EmpId is uodated now");
	}
	public void setsalary(double salary) {
		this.salary=salary;
		 System.out.println("salary is updated now");
	}
	
}
public class Encap3 {

	public static void main(String[] args) {
		Demo d1= new Demo();
		 System.out.println("Accessing private data member outside the class using getter concept-EmpId: "+d1.getEmpId());
		 System.out.println("Accessing private data member outside the class using getter concept-salary: "+d1.getsalary());
		 System.out.println("***********updating private data member************");
		 d1.setEmpId(10001);
		 d1.setsalary(550000);
		 System.out.println("Updated,Accessing private data memeber ouside the class using getter consept-EmpId: "+d1.getEmpId());
		 System.out.println("Updated,Accessing private data memeber ouside the class using getter consept-salary: "+d1.getsalary());
		 System.out.println("*********************************");
		 Demo d2=new Demo();
		 System.out.println("Accessing private data member outside the class using getter concept-EmpId: "+d2.getEmpId());
		 System.out.println("Accessing private data member outside the class using getter concept-salary: "+d2.getsalary());
		 
	}

}
