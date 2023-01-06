package PackageModifiers;

public class ProtectedMembers {
	protected int accNum=123456;
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[]args) {
		ProtectedMembers p1= new ProtectedMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
 
class AcessProtectedMember{
	public static void main(String[] args) {
		ProtectedMembers p1= new ProtectedMembers();
		System.out.println("Accesing protected member from child class ");
		System.out.println(p1.accNum);
		p1.displayAccNum();

	}

}

// protected members can be accessible within package only 
// but we can access from another package using inheritance