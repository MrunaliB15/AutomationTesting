package Operator;

public class Test {
	static int fun (int n)
	{ 
		int result;
	    result= fun (n-1);
	    return result;
	
	
	}

	public static void main(String[] args) {
	
		System.out.println(fun(12));
		

	}

}
