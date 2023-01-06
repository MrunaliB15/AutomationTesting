package PackageModifiers;

public class DefaultMembers {
	int accNum=2468;
	void displayAccNum() {
		System.out.println("Account number: "+accNum);
	}
	public static void main(String[] args) {
		DefaultMembers p1=new DefaultMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
class AcessDefaultMembers{
	public static void main(String[] args) {
		DefaultMembers p1= new DefaultMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

// default member having visibility up to package level