package PackageModifiers;

public class PublicMembers {
	public int accNum=1234;
	public void  displayaccNum() {
	  System.out.println("Account no.: "+accNum);
	}
	public static void main(String[] args) {
		PublicMembers p1= new PublicMembers();
		System.out.println(p1.accNum);
		p1.displayaccNum();
	}
}
	 class AccessPublicMembers{
	public static void main(String[] args) {
		PublicMembers p1= new PublicMembers();
		System.out.println("Accesing Default Member FromChild Class");
		System.out.println(p1.accNum);
		p1.displayaccNum();
	}
	 }
   //member can be access from anywhere but make sure that class should be declared as public