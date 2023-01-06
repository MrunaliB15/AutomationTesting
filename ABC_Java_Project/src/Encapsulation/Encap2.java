package Encapsulation;

class EncapsulationDemo{
	private int ssn;
	private int empAge;
	//getter and setter method
	public int getSsn() {
		return ssn;
	}
	public void setssn(int ssn) {
		this.ssn=ssn;
	}
	public int getempAge() {
		return empAge;
	}
	public void setempAge(int empAge) {
		this.empAge=empAge;
	}
}

public class Encap2 {

	public static void main(String[] args) {
		EncapsulationDemo e1= new EncapsulationDemo(); 
		 System.out.println("Employee Age: "+e1.getempAge());
		 System.out.println("Employee SSN: "+e1.getSsn());
		 System.out.println("******************");
		 e1.setempAge(30);
         e1.setssn(112233);
         System.out.println("Employee Age: "+e1.getempAge());
         System.out.println("Employee SSN: "+e1.getSsn());
	}

}
