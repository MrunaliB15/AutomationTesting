package Casting;

public class PrimitiveCasting2 {

	public static void main(String[] args) {
		int salary=20000;
		//explicit widening
		double SalaryDouble=(double)salary;
		float SalaryFloat=(float)salary;
		System.out.println("salary: "+salary+"\nSalaryDouble: "+SalaryDouble+"\nSalaryFloat: "+SalaryFloat);
		//implicit widening
         double SalaryDouble1=salary;
         float SalaryFloat1=salary;
         System.out.println("******************");
         System.out.println("salary: "+salary+"\nSalaryDouble1: "+SalaryDouble1+"\nSalaryFloat: "+SalaryFloat1);
         
         //explicit narrowing
         double salaryDb=30000.45;
         int salaryInt=(int)salaryDb;
         float salaryfloat=(float)salaryDb;
         System.out.println("*********************");
         System.out.println("salary: "+salaryDb+"\nsalaryInt: "+salaryInt+"\nsalaryfloat: "+salaryfloat);
         //implicit narrowing is not possible
	}

}
