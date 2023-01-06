package Overriding;
class parent{
	void show() {
		System.out.println("parent show..");
	}
}
class child extends parent{
	@Override
	void show() {
		System.out.println("child show..");
	}
}

public class Overriding4 {

	public static void main(String[] args) {
		parent obj=new parent();
		obj.show();
        parent obj1 = new child();
        obj1.show();
	}

}
