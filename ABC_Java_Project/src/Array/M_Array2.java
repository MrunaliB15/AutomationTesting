package Array;

public class M_Array2 {

	public static void main(String[] args) {
		char[] copyFrom= { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'}; 
         char[] copyTo=new char[7];
      // copying array using System.arraycopy() method
			//src, indextocopy, dest, indextostart,indextoend
         System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
         for(int i=0; i<copyTo.length; i++) {
        	System.out.println(copyTo[i]);
         }
	}

}
