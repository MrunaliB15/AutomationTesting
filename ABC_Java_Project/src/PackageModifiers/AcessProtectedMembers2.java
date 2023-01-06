package PackageModifiers;

public class AcessProtectedMembers2 extends ProtectedMembers{

	public static void main(String[] args) {
		AcessProtectedMembers2 p1= new AcessProtectedMembers2();
		System.out.println("Accessing protected member from class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();

	}

}
