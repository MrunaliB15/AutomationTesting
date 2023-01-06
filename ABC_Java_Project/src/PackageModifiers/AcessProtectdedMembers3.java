package PackageModifiers;

public class AcessProtectdedMembers3 extends ProtectedMembers {
	void Calling(){
		System.out.println("i am calling....");
	}

	public static void main(String[] args) {
		AcessProtectdedMembers3 p1= new AcessProtectdedMembers3();
		System.out.println("Accesing Protected members from another class outside of package ");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
class Example1 extends AcessProtectdedMembers3{
	public static void main(String[] args) {
	AcessProtectdedMembers3 a1= new AcessProtectdedMembers3();
	a1.Calling();
	}
}
