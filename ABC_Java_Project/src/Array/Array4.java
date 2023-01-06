package Array;

class arraytest{
	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
		if (min>arr[i]) {
			min=arr[i];
		}
		}
		System.out.println("min no. of array is: "+min);
	}
	
	
	static void max(int arr[]) {
		int max= arr[0];
		for(int i=1; i<arr.length; i++) {
		if (max<arr[i]) {
			max=arr[i];
		}
		}
		System.out.println("max no. of array is: "+max);
		}
	}

   class Array4{
	   public static void main(String[] args) {
		   int a[]= {12, 5, 9, 17, 24, 56};
		   arraytest.min(a);
		   arraytest.max(a);
	   }
   }

	