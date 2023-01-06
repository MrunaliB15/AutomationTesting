package ArraysAssignment;
 
import java.util.Arrays;
public class DuplicateArray {

	public static void main(String[] args) {
		int arr[]= {15, 12, 29, 8, 2, 14};
		System.out.println("printing original array..");
		for(int i: arr) {
			System.out.println(i);
		}
		
		System.out.println("duplicate array...");
		int newDuplicateArray[]=Arrays.copyOf(arr, arr.length);
		for(int i: newDuplicateArray) {
		System.out.println(i);
		}
	}

}
