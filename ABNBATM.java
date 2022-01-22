package models;

public class ABNBATM extends ATMTemplate{

	public ABNBATM(String BankName, int accountNumber) {
		super(BankName, accountNumber);//The super() in Java is a reference variable that is used to refer parent class i.e ATMTemplate class constructors.
		// TODO Auto-generated constructor stub
	}

	//to get below right click--source--override/implements
	@Override
	void balanceEnquiry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void withdrawAmount() {
		// TODO Auto-generated method stub
		System.out.println("You have with drawn amount from ABNB Bank");
		
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
