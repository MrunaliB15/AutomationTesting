package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ExceptionHandling12 {
	public int divideNum(int m, int n)throws ArithmeticException{
		int div=m/n;
		return  div;
	}

	public static void main(String[] args) {
		
		ExceptionHandling12 obj=new ExceptionHandling12();
		  try {
			  System.out.println(obj.divideNum(48, 8));
		  }
		  catch(ArithmeticException e) {
			  System.out.println("no. can not be divide by 0");
		  }
		  System.out.println("rest of the code");

	}

}
