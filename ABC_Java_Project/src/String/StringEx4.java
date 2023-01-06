package String;

public class StringEx4 {

	public static void main(String[] args) {
		
		StringEx4 s0= new StringEx4();
		System.out.println("s0: "+s0);
		
		String s1="Pune";
		String s2="Pune";
		String s3="Mumbai";
		
		System.out.println("s1:"+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("s1 char count: "+s1.length());
		System.out.println("s2 char count: "+s2.length());
		System.out.println("s3 char count: "+s3.length());
		/*  Outside string class
		 * "=="----> compare two value
		 * .equals(obj)--->compare two object based on three address
		 * inside string class
		 * "=="---> compare two object based on address
		 * equals(obj)---> compare two object based on values
		 */
		System.out.println(" s1 and s2 using equals(): "+s1.equals(s2)); //compare based on values
		System.out.println("s1 and s2 using ==: "+(s1==s2));  // compare based on address
		System.out.println("s1 and s3 using equals(): "+s1.equals(s3)); // compare based on values
		System.out.println("s1 and s3 using ==: "+(s1==s3)); // compare based on address
		
		String s4= new String("Pune");
		System.out.println("s4: "+s4);
		System.out.println("s1 and s4 using equals(): "+s1.equals(s4));
		System.out.println("s1 and s4 using ==: "+(s1==s4));
		
		String s5= new String("Pune");
		System.out.println("s5: "+s5);
		System.out.println("s4 and s5 using equals(): "+s4.equals(s5));
		System.out.println("s4 and s5 using ==: "+(s4==s5));
		
		String s6=new String("Mumbai");
		System.out.println("s6: "+s6);
		System.out.println("s1 and s6 using equals(): "+s1.equals(s6));
		System.out.println("s1 and s6 using ==: "+(s1==s6));
	}
}
