package Abstract;
   
abstract class RBIBank{
	abstract double getRateOfIntrestForHomeLoan();  //final keywords get error
	final void loan() {
		System.out.println("as per RBI loan");
	}
}
class PNB extends RBIBank{
	double getRateOfIntrestForHomeLoan() {
	return 8.5;
	}
}
class SBI extends RBIBank{
	double getRateOfIntrestForHomeLoan() {
		return 3.56;
	}
}
public class abstract4 {

	public static void main(String[] args) {
		SBI s1=new SBI();
		System.out.println("SBI rate of intrest: "+s1.getRateOfIntrestForHomeLoan()+" %");
         s1.loan();
         System.out.println("************");
         PNB p1=new PNB();
         System.out.println("PNB rate of intrest: "+p1.getRateOfIntrestForHomeLoan()+"%");
         p1.loan();
         System.out.println("************");
         RBIBank b1=new SBI();
         System.out.println("RBI reference but object of SBI, Rate of Interest is: " + b1.getRateOfIntrestForHomeLoan() + " %");
         System.out.println("**************");
 		RBIBank b2 = new PNB();
 		System.out.println("RBI reference but object of PNB, Rate of Interest is: " +b2.getRateOfIntrestForHomeLoan()+ " %");	
 	}
 }

