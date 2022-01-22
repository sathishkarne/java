package models;

public class XAMBATM extends ATMTemplate{
	public XAMBATM(String BankName, int accountNumber) {
		super(BankName, accountNumber);
	}

	@Override
	void balanceEnquiry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void withdrawAmount() {
		// TODO Auto-generated method stub
		System.out.println("You have with drawn amount from XAMB Bank");
		
	}

	@Override
	void miniStatement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void transfer() {
		// TODO Auto-generated method stub
		
	}

}
