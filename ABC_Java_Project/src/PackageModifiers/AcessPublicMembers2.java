package PackageModifiers;

public class AcessPublicMembers2 {

	public static void main(String[] args) {
		PublicMembers p1= new PublicMembers();
		System.out.println("Accesing public member from another class outside package");
		System.out.println(p1.accNum);
		p1.displayaccNum();
	}
}
class Demo{
	public static void main(String[] args) {
		PublicMembers p1= new PublicMembers();
		System.out.println("Accesing public member from another class outside package");
		System.out.println(p1.accNum);
		p1.displayaccNum();
	}
}
