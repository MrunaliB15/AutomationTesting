package Pyramid;

public class InvertHalfPyramidUsingNumber {

	public static void main(String[] args) {
		for(int i=5;i>=0;i--) {
			for(int j=1;j<=i;j++) {
		System.out.print(j+" ");
			}
			System.out.println();
		}
	
        for(int i=5;i>=1;i--) {
        	for(int j = 1;j<=i;j++) {
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
	}
}
			
		

	


