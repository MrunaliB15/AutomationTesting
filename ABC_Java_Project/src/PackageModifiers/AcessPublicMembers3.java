package PackageModifiers;

public class AcessPublicMembers3 {

	public static void main(String[] args) {
		// using fully qualified class name: packagename.classname 
        PackageModifiers.AcessPublicMembers3 p1= new PackageModifiers.AcessPublicMembers3();
        System.out.println(" Accessing public members from another class outside package");
        System.out.println(p1.accNum);
        p1.displayAccNum();
	}
}
