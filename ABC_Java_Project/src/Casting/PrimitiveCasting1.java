package Casting;

public class PrimitiveCasting1 {

	public static void main(String[] args) {
		int myInt=8;
		double mydouble=myInt;
		double d=(double)myInt;
          System.out.println(myInt);
          System.out.println(mydouble);
          System.out.println(d);
          
          double salary=24300.645287468d;
           int sal=(int)salary; 
           long l=(long)salary;
           float f=(float)salary;
           double var=sal;
           System.out.println("actual salary: "+salary);
           System.out.println("int salary: "+sal);
           System.out.println("long salary: "+sal);
           System.out.println("float salary: "+sal);
           System.out.println("double salary: "+var);
           
	}

}
