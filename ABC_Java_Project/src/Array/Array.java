package Array;

public class Array {

	public static void main(String[] args) {
		String[] cars={ "volvo" , "BMW", "ford"," mazda"};
		System.out.println(cars[0]);
		//change of array element
		//cars[0]="opel";
         //System.out.println(cars[0]);
		//counting
		System.out.println("cars: "+ cars.length);
		System.out.println("*********normal for loop*********");
		for(int i=0;i<cars.length;i++) {
		System.out.println(cars[i]);
		}
		System.out.println("********for each loop*******");
        for (String i: cars) {
        System.out.println(i);
        }
	}
}
