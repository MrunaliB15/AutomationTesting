package Pyramid;

public class FullPyramidUsingStar {
	public static void main(String[] args) {
			int n=5,i,s,j;
			for(i=1;i<=n;i++) {
				for(s=1;s<=n-i;s++) 
					System.out.print("  ");
							for(j=1;j<=i*2-1;j++) 
						System.out.print("* ");
					
					System.out.println();
			}
	

				
				//n=no.of line
			   //i=row counting
	           //s=space	
					
                int n1=5,i1,s1,j1;
               for(i1=1;i1<=n1;i1++) {
	            for(s1=1;s1<=n1-i1;s1++) 
	            	System.out.print("  ");
			        	for(j1=1;j1<=i1;j1++) 
			     System.out.print(" *  ");
			        	
	         System.out.println();
               }
	}
}




	


	
			
	

		
	

			
		
		