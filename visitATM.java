package models;

public class visitATM {
	public static void main(String[] args) {
		ATMTemplate atm=new XAMBATM("ABNBB", 3022350);
		atm.wishCustomer();
		atm.withdrawAmount();
	}

}
