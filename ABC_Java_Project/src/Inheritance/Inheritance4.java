package Inheritance;

class A2 {
	 void msg() {
		System.out.println("good morning");
	}
}
class  B2{
	 void msg() {
		System.out.println("have a great day");
	}
}
class Inheritance4 extends A2,B2{
	   Inheritance4(){
		   super();
	   }
	   
	public static void main(String[] args) {
		Inheritance4 obj= new Inheritance4();
         obj.msg();
	}
  }
