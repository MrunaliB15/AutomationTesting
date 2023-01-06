package Pyramid;

public class InvertFullPyramidUsingStar {

	public static void main(String[] args) {
		int n=5,i,b,j;
		for(i=1;i<=n;i++) {
			for(b=1;b<i;b++)
				System.out.print("  ");
			for(j=1;j<=2*(n-i)+1;j++)     // j<=2*(n-i)+1----> j<=2*(5-1)+1 = j<=9
				System.out.print("* ");          // j<=2*(5-2)+1 = j<=7
			System.out.println();
		}
		
		
		for(i=1;i<=n;i++) {
			for(b=1;b<i;b++)
				System.out.print("  ");
			for(j=1;j<=2*(n-i)+1;j++)
				System.out.print(j+ " ");
			System.out.println();
		}
		
		for(i=1;i<=n;i++) {
			for(b=1;b<i;b++)
				System.out.print("  ");
			for(j=1;j<=2*(n-i)+1;j++)
				System.out.print(i+" ");
			System.out.println();
		}
		
		for(i=1;i<=n;i++) {
			for(b=1;b<i;b++)
				System.out.print("  ");
			for(j=1;j<=2*(n-i)+1;j++)
				System.out.print((n-i+1)+" ");
			System.out.println();
		}
	}
}
            