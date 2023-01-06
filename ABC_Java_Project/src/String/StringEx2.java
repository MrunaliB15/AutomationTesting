package String;

public class StringEx2 {

	public static void main(String[] args) {
		String s11= new String("mumbai");
		String s21= new String("Goa");
		String s31= new String("Mumbai");
		
		System.out.println("s11: "+s11);
		System.out.println("s21: "+s21);
		System.out.println("s31: "+s31);
		System.out.println("comparing s11 and s21 on the basis of address: "+(s11==s21));
		System.out.println("comparing s21 and s31 on the basis of address: "+(s21==s31));
		System.out.println("comparing s11 and s31 on the basis of address: "+(s11==s31));
		System.out.println("comparing s11 and s21 on the basis of value: "+s11.equals(s21));
		System.out.println("comparing s21 and s31 on the basis of value: "+s21.equals(s31));
		System.out.println("comparing s11 and s31 on the basis of value: "+s11.equals(s31));
			
	}
}
