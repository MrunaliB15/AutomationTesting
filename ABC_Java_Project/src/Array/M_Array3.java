package Array;

import java.util.Arrays;

public class M_Array3 {

	public static void main(String[] args) {
		int arr[]= {23, 6, 14, 9};
		System.out.println("printing original array...");
		for(int i: arr) {
		System.out.println(i);
		}
		
		System.out.println("printing clone of the array...");
		int carr[]=arr.clone();
		for (int i: carr) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		System.out.println("are both equal arr and carr?");
		System.out.println(Arrays.equals(arr, carr));
		System.out.println("******copy array*******");
		int newCopiedArray[]=Arrays.copyOf(arr, arr.length);
		for(int i:newCopiedArray) {
			System.out.println(i);
		}
		System.out.println("******range of array********");
		int newCopiedRangeArray[]=Arrays.copyOfRange(arr, 0, 3);
		for(int i: newCopiedRangeArray) {
		System.out.println(i);
		}
		System.out.println("--------------------------");
		System.out.println("comparing newCopiedRangeArray & newCopiedArray..."+Arrays.equals(newCopiedArray, newCopiedRangeArray));
		System.out.println("*************************");
		Arrays.sort(arr);
		System.out.println("after sorting original array");
		for(int i: arr) {
		System.out.println(i);
		}
	}

}
