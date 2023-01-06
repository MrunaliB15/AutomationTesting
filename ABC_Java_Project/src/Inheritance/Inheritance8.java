package Inheritance;

class Home{
	void display(){
		System.out.println("Home class display...");
	}
}
class Member extends Home {
	void display() {
		System.out.println("Member class display....");
	}
	void callme() {
		System.out.println("Member class call me...");
	}
}
public class Inheritance8 {

	public static void main(String[] args) {
		Member e1= new Member();
		e1.display();
		e1.callme();
		System.out.println("***********");
		Home c1=new Home();
		c1.display();
		System.out.println("*********");
		Home c2= new Member();
		c2.display();
	}

}
