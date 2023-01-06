package Encapsulation;

public class Encap1 {

	public static void main(String[] args) {
		//creating instance of Account class
		Account acc= new Account();
		// setting value through setter method
		acc.setAcc_no(7560504000L);
        acc.setAmount(500000f);
        // getting value through getter method
        System.out.println(acc.getAcc_no());
        System.out.println(acc.getAmount());
	}

}
