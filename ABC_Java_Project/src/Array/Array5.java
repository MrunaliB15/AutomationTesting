package Array;

class TestReturnArray{
	static int[] getarray(){
		return new int[] {20, 40, 60, 80, 90};
		}
	
	static int num() {
		return (20+80);
	}
}
	
	class Array5{
		public static void main(String[] args) {
			int arr[]=TestReturnArray.getarray();
			for (int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
		}
	}
}



