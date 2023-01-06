package Pyramid;

public class FloydTriangle {

	public static void main(String[] args) {
		int n=5,i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++) {
				System.out.print((i+j)+" ");
			}
			System.out.println();
		}
	}

}
