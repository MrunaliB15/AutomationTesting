package PackageModifiers;

public class StaticKeyword {
	static void myStaticMethod() {
		 System.out.println("static method called without creating an object");
	 }
	public void myPublicMethod() {
		System.out.println("public method called by creating a object");
	}

	public static void main(String[] args) {
     myStaticMethod(); //static method called without creating an object
    // myPublicMethod();
     
     StaticKeyword myobj= new StaticKeyword();
     myobj.myPublicMethod();  //static method called without creating an object
	}

}
