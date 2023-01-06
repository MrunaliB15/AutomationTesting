package Interface;
 
interface Bank{
	float RateOfIntrest();
}
class SBI102 implements Bank{
	public float RateOfIntrest() {
		return 3.23f;
	}
}
class PNB102 implements Bank{
	public float RateOfIntrest() {
		return 2.3f;
	}
}
public class interface2 {

	public static void main(String[] args) {
		SBI102 s =new SBI102();
		System.out.println("ROI of SBI: "+s.RateOfIntrest());
		System.out.println("***********");
		PNB102 p= new PNB102();
		System.out.println("ROI of PNB: "+p.RateOfIntrest());
		System.out.println("************");
		Bank b=new PNB102();
		System.out.println("ROI of Bank PNB: "+b.RateOfIntrest());
	}

}
