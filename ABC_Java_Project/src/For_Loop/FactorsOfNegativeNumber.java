package For_Loop;

public class FactorsOfNegativeNumber {
	
	public static void main(String[] args) {
      int num=-12;
      System.out.println("the factors of -12 is: ");
      for (int i=num; i<=Math.abs(num);++i)
          if (i==0)
          {
    		  continue;
          }
          else {
        	  System.out.print(i + " , ");
          }
	}
}
      
		
      
		
	
		