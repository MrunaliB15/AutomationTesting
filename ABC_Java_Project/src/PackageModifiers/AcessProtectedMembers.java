package PackageModifiers;

public class AcessProtectedMembers {

	public static void main(String[] args) {
		ProtectedMembers p1= new ProtectedMembers();
		System.out.println("Accesing protected members from same class within same package");
		System.out.println(p1.accNum);
         p1.displayAccNum();
	}

}
