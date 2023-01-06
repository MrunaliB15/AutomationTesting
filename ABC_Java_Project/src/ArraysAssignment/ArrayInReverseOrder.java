package ArraysAssignment;

public class ArrayInReverseOrder {

	public static void main(String[] args) {
		int arr[]= {12, 23, 28, 11, 6, 8};
		System.out.println("original arrays..");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(" Arrays in reverse order.....");
		for(int  i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}

}
