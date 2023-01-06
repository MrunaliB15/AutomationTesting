package Array;

public class Array1 {

	public static void main(String[] args) {
		/*
		 //declaration 
		  int a[];
		  // initilisation
		   a=new int[5]
		 */
       
		int a[]=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		(a[0])=10;
		(a[1])=20;
		(a[2])=30;
		(a[3])=40;
		(a[4])=50;
		System.out.println("*******************");
		System.out.println("array element count: "+a.length);
		System.out.println("********for loop********");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
		System.out.println("*******for each loop********");
		for(int i: a) {
			System.out.println(i);
		}
		System.out.println("************char**********");
		char[] getarray=new char[4];
		getarray[0]='A';
		getarray[1]='B';
		getarray[2]='C';
		getarray[3]='D';
		 //or
		//char[] getarray1= {'A','B','C','D'};
		 //or
		//char[] getarray2=new char[] {'A','B','C','D'};
		System.out.println("array char count: "+getarray.length);
		System.out.println("*******for loop***********");
		for(char i=0;i<getarray.length;i++) {
			System.out.println(getarray[i]);
		}
		System.out.println("******for each loop*********");
		for(char num:getarray ) {
		System.out.println(num);
	}
	}
}
