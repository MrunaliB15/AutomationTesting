package Array;

import java.util.Arrays;
	class SampleArray{
		public static void main(String[] args) {
			int a=10, b=30, c=50;
			
			int num[]= new int[5];
			num[0]=10;
			num[1]=30;
			num[2]=50;
			
			int[] num1= {10, 30, 50};
			System.out.println("Array element count: "+num1.length);
			System.out.println("1st or 2nd element of array: "+num1[1]);
			System.out.println("print all element og array...");
			for (int i=0; i<num1.length; i++) {
			System.out.println(num1[i]);
		}
			System.out.println("**********************");
			int[] num2=Arrays.copyOf(num1,  5);
			System.out.println("size of num2: "+num2.length);
			for( int i=0; i<num2.length; i++) {
				System.out.println("element in index: "+i+"  "+num2[i]);
			}
			
			num2[2]=40;
			num2[3]=70;
			System.out.println("***********************");
			for(int i=0; i<num2.length; i++) {
			System.out.println(num2[i]);
			}
			
			num2[1]=102;
			num2[2]=202;
			System.out.println("*******updated value********");
			for(int i=0; i<num2.length; i++) {
			System.out.println(num2[i]);
			}
		}
	}



