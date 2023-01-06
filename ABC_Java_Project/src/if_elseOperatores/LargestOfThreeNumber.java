package if_elseOperatores;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
		System.out.println("program start");
		int a=24,b=102,c=56;
		System.out.println("a= "+a+"\nb= "+b+"\nc ="+c);
		
		if(a>b)
		{
		  if (a>c)
		  {
		     System.out.println("largest no.is a "+a);
		  } else {
			System.out.println("largest no. is c: "+c);
		}
		
		}
		else if (b>c)
		{
			System.out.println("largest no. is b: "+b);
		}
		else {
			System.out.println("largest no. is c: "+c);
		}
	  }
    }
	
		
			

