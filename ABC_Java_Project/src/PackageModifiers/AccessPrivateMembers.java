package PackageModifiers;

public class AccessPrivateMembers {

	public static void main(String[] args) {
		PrivateMembers p1= new PrivateMembers();
		System.out.println("Accesing private Members from same class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
