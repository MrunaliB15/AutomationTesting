package StringBufferAndBuilder;

public class StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java 
		sb.reverse();
		System.out.println(sb);//prints Hello Java 
		StringBuilder sb1=new StringBuilder();
		sb1.append("hello java");
		System.out.println(sb1);
		StringBuilder sb2=new StringBuilder();
		sb2.append("hello java");
		System.out.println(sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println((sb1.toString().equals(sb2.toString())));

	}
}