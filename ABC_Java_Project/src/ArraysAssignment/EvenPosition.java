package ArraysAssignment;

public class EvenPosition {

	public static void main(String[] args) {
		int arr[]= {6, 8, 13, 24, 34, 10};
		System.out.println("elements of array on even position");
		for(int i=0; i<arr.length; i=i+2) {
		System.out.println(arr[i]);
		}
	}

}
