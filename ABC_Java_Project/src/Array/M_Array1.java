package Array;

public class M_Array1 {

	public static void main(String[] args) {
		int arr[][]={ {1,3,5}, {2,4}, {6,7,8,9} };
         for(int i=0; i<arr.length; i++) {
        	 for(int j=0; j<arr[i].length; j++) {
        		 System.out.print(arr[i][j]+" ");
        	 }
        	 System.out.println();
         }
         System.out.println("*****************");
         char chararr[][]= { {'a','b'}, {'c','d','e'}, {'x','y','z'}};
         for(int i=0; i<chararr.length; i++) {
        	 for(int j=0; j<chararr[i].length; j++) {
        		 System.out.print(chararr[i][j]+" ");
        	 }
        	 System.out.println();
         }
         
	}

}
