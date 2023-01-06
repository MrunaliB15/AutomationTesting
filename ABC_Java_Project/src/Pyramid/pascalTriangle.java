package Pyramid;

public class pascalTriangle {

	public static void main(String[] args) {
		
			  System.out.println();
		
		System.out.println("enter no. of line ");
		int spaces=0,n1=5,j1,b1;
	    for(i=0;i<=0;i++) {
	    	for(b1=1;b1<=spaces;b1++) {
	    		System.out.print("  ");
	    	}
	    	for(j1=0;j1<=i;j1++) {
	    		System.out.print(n1+" ");
	    		n1=n1*(i-j1)/(j1+1);
	    	}
	    	spaces--;
	    	System.out.println();
	    }

	}

}
