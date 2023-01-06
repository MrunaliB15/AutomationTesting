package String;

public class StringEx6 {

	public static void main(String[] args) {
		String s1="I Am From Maharashtra";
		System.out.println("Actual String: "+s1);
		String[] strAry=s1.split(" ");
		(String s: strAry){
		System.out.println(s);
		}
		System.out.println("**************");
		String s2="I Am From Pune";
		System.out.println("Actual String: "+s2);
		String[] strAry2=s2.split(" ",3);
		(String s: strAry2){
		System.out.println(s);
		}
		System.out.println("****************");
		String s3="I Am From Rajasthan";
		System.out.println("Actual String: "+s3);
		String[]strAry3=s3.split(" ");
		String temp="";
		
		for(int i=str.length()-1; i>=0; i--) {
			temp=temp+" "+str[i];
		}
		System.out.println("reverse statement: "+temp);
		System.out.println("*******************");
		String s4="    I Am Devid     ";
		System.out.println("Actual string with space: "+s4);
		System.out.println("Actual string length: "+s4.length());
		System.out.println("Actual string without space: "+s4.trim());
		System.out.println("Actual string length without space: "+s4.trim().length());
		
		String s5="I   Am   Devid";
		System.out.println("Actual string without space: "+s5.trim());
		System.out.println("string length without space: "+s5.trim().length());
	}

}
