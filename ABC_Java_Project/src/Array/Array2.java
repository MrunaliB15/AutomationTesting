package Array;

public class Array2 {

	public static void main(String[] args) {
		int[] age= {2, 12, 4, 25, 3};
		
		System.out.println("elements of array:");
		System.out.println("first element: "+age[0]);
		System.out.println("second element: "+age[1]);
		System.out.println("third element: "+age[2]);
		System.out.println("fourth element: "+age[3]);
		System.out.println("five element: "+age[4]);
		System.out.println("**********************");
		System.out.println("array size: "+age.length);
		System.out.println("********for  loop**********");
		for(int i=0;i<age.length;i++) {
         if(age[i]==12) {
        	 System.out.println(age [i]);
        	 break;
         }
         else {
        	 System.out.println("age is not 12");
         }
		}
         System.out.println("********for each loop***********");
         for(int a: age) {
         if(a==12) {
        	 System.out.println(a);
        	 break;
         }
         else {
        	 System.out.println("age is not 12");
         }
         }
	}
}
