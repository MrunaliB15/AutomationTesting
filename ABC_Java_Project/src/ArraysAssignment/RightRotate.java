package ArraysAssignment;

public class RightRotate {

	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("original array..");
		for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+"  ");
		}
			 int second=a[0];
			 int third=a[0];
			 for(int j=0; j<a.length-1; j++) 
			 {
				 a[j]=a[j+1];
			 }
			 System.out.println();
			 a[a.length-1]=second;
			 System.out.println("right rotate..");
			 for(int i=0; i<a.length; i++) {
			 System.out.print(a[i]+"  ");
			 }
	}
}

                  //a[i]=a[i+1]------> a[0]=a[0+1]=a[1]=2