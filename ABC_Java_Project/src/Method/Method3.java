package Method;

public class Method3 {

	public static void main(String[] args) {
		System.out.println("Result of addition1: "+getAdditionResult(234.45,67));
		System.out.println("****************");
		System.out.println("Result of addition2: "+Method3.getAdditionResult(234.45,67));
		System.out.println("******************");
		double sum=getAdditionResult(45,67);
		System.out.println("sum of two numbers: "+sum);
		double finalresult=sum*100;
		System.out.println("result after some operation: "+finalresult);
	}
	 static double getAdditionResult(double num1 , double num2) {
	
	 System.out.println("Number1: "+num1);
	 System.out.println("Number2: "+num2);
	double res=num1+num2;
	 return res;

	}

}
