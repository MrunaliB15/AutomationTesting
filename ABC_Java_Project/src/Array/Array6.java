package Array;

import java.util.Arrays;
public class Array6 {
	
	public static void main(String[] args) {
		int[] num1= {21, 12, 23, 5, 7, 25, 30};
        for( int a:num1){
      System.out.println(a);
        }
        Arrays.sort(num1);
        System.out.println("*********after sorting******");
        for(int a: num1){
        System.out.println(a);
        }
        System.out.println("********copy of array*************");
         int CopyArray[]=Arrays.copyOf(num1, 10);
		for(int num: CopyArray) {
			System.out.println(num);
		}
		System.out.println("******copy of range***********");
		int num2[]=Arrays.copyOfRange(num1, 0, 5);
		for(int a:num2) {
			System.out.println(a);
		}
	}

}
