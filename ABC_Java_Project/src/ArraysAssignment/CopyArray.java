package ArraysAssignment;

import java.util.Arrays;
public class CopyArray {

	public static void main(String[] args) {
		int arr[]= {2, 13, 5, 24, 6, 18};
		System.out.println("printing original array....");
		for(int i: arr) {
			System.out.println(i);
		}
		
		System.out.println("copy array...");
		int newCopiedArray[]=Arrays.copyOf(arr, arr.length);
		for(int i: newCopiedArray) {
			System.out.println(i);
		}
	}

}
