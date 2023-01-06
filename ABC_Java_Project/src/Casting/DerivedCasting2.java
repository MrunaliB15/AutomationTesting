package Casting;

class Member{
	long phone=8745673212l;
	void chat() {
		System.out.println("chatting in whatsapp group with: "+phone);
	}
}
class Admin extends Member{
	void addNo() {
		System.out.println("adding a new no. in whatsapp group");
	}
}

public class DerivedCasting2 {

	public static void main(String[] args) {
		Member m1=new Admin();
		m1.phone = 8745673212l;
         m1.chat();
         System.out.println("****************");
         Admin ad=(Admin) m1;
         ad.chat();
         ad.addNo();
         System.out.println(ad.phone);
	}

}
