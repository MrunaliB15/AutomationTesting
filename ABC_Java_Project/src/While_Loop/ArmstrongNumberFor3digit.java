package While_Loop;

public class ArmstrongNumberFor3digit {

	public static void main(String[] args) {
		int num=234,temp,rem=0;
		double sum=0;
		temp=num;
		System.out.println("the no. is: "+num);
		while (temp>0) {
			rem=temp%10;
		   sum=sum+rem*rem*rem;
		   temp=temp/10;
	}
	 if (num==sum)
	 {
		 System.out.println("given no. is amstrong");
	 }
	 else
	 {
		 System.out.println("given no. is not amstrong"); 
	 }
	}
}
		
		
	
		
		
		
		
		



		    					
		    			
		    					
		    
	


	         