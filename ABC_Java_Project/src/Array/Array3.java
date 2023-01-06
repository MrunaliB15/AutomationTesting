package Array;

public class Array3 {

	public static void main(String[] args) {
		int[] numbers= {3, 4 ,-4, 5, 3, 12, 21, -14, 24};
	      double sum = 0;
	      double average;
	      //("*****for each loop**********");
	      for(int number:numbers) {
	    	  sum=sum + number;
	      }
	    	  int arraylength=numbers.length;
			average= sum / arraylength;
			System.out.println("sum: "+sum);
			System.out.println("avarage: "+average);
	      }
		}


	