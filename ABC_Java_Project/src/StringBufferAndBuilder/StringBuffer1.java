package StringBufferAndBuilder;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Hello");
		System.out.println("Original string Buffer: "+s1);
		System.out.println("******************");
		
		s1.append("Maharashtra");
		System.out.println(s1);
		System.out.println("******************");
		
        s1.insert(3, "Mumbai");
        System.out.println(s1);
        System.out.println("******************");
        
        s1.replace(1, 3,"***" );
        System.out.println(s1);
        System.out.println("*******************");
        
        s1.delete(1, 3);
        System.out.println(s1);
        System.out.println("********************");
        
        StringBuffer s2= new StringBuffer("Madras is famous for IIT");
        s2.reverse();
        System.out.println(s2);
        System.out.println("===================");
        StringBuffer s3= new StringBuffer();
        System.out.println(s3.capacity());
        s3.append("hey");
        System.out.println(s3.capacity());
        s3.append("java is a language");
        System.out.println(s3.capacity());
        s3.append("it is automation area");
        System.out.println(s3.capacity());
        
	}

}
