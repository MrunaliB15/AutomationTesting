package ScannarAndSystemClass;

public class SystemArrayCopyEx1 {

	public static void main(String[] args) {
		String a[]= {"A", "C", "C", "G", "J", "M"};  //source array
		String b[]= { "N", "F", "D", "N", "L", "S", "L", "O", "U", "T", "U"}; //destination array
		String src[], dest[];
		int srcPos, destPos, length;
		src= a;
		srcPos=2;
		dest= b;
		destPos=3;
		length=4;
		
		System.out.println("source array..");
		for(int i=0; i<src.length; i++) {
		System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("*****************");
		System.out.println("Destination array..");
		for(int i=0; i<src.length; i++) {
		System.out.print(b[i]);
		}
		System.out.println();
		System.out.println("*****************");
		System.out.println("sourse position: "+srcPos);
		System.out.println("destination position: "+destPos);
		System.out.println("Length: "+length);
		System.arraycopy(src, srcPos,dest, destPos, length);
		System.out.println("destination position after arraycopy() :");
		for(int i=0; i<b.length; i++) {
		System.out.print(b[i]);
		}
	}

}
