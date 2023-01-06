package Abstract;
 abstract class bike{
	 abstract void run();
	 void speed(int spd) {
		 System.out.println("bike speed: "+spd);
	 }
 }
 class honda extends bike{
	 void run() {
		 System.out.println("running safely");
	 }
	 void speed(int spd) {
		 System.out.println("honda speed: "+spd); 
		 super.speed(120);
	 }
	 void colour() {
		 System.out.println("colour is black");
	 }
 }
public class abstract2 {

	public static void main(String[] args) {
		honda h =new honda();
		h.run();
        h.speed(50);
        h.colour();
        System.out.println("************");
        bike b= new honda();
        b.run();
        b.speed(20);
	}

}
