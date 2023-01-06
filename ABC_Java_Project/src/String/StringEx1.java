package String;

public class StringEx1 {

	public static void main(String[] args) {
		String s1="Mumbai";
		String s2= "Goa";
		String s3= "Mumbai";
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("comparing s1 and s2 on the basis of value: "+(s1==s2));
		System.out.println("comparing s2 and s3 on the basis of value: "+(s2==s3));
		System.out.println("comparing s1 and s3 on the basis of value: "+(s1==s3));
		System.out.println("comparing s1 and s2 on the basis of adress: "+s1.equals(s2));
		System.out.println("comparing s2 and s3 on the basis of adress: "+s2.equals(s3));
		System.out.println("comparing s1 and s3 on the basis of adress: "+s1.equals(s3));
	}

	
	//class String0{
		void city() {
	String s11= new String("mumbai");
	String s21= new String("Goa");
	String s31= new String("Mumbai");
	
	System.out.println("s11: "+s11);
	System.out.println("s21: "+s21);
	System.out.println("s31: "+s31);
	System.out.println("comparing s11 and s21 on the basis of value: "+(s11==s21));
	System.out.println("comparing s21 and s31 on the basis of value: "+(s21==s31));
	System.out.println("comparing s11 and s31 on the basis of value: "+(s11==s31));
	System.out.println("comparing s11 and s21 on the basis of adress: "+s11.equals(s21));
	System.out.println("comparing s21 and s31 on the basis of adress: "+s21.equals(s31));
	System.out.println("comparing s11 and s31 on the basis of adress: "+s11.equals(s31));
		}
	}
       
       