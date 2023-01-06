package PackageModifiers;

public class AcessPublicMembers {

	public static void main(String[] args) {
		PublicMembers p1= new PublicMembers();
		System.out.println("Accesing public member from another class within same package");
		System.out.println(p1.accNum);
		p1.displayaccNum();

	}

}
