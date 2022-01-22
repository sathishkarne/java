//abstract classes
package models;

public abstract class ATMTemplate {
	String BankName; //type 
	int accountNumber;
	
	//regular method
	public ATMTemplate(String BankName, int accountNumber) {  //it is constructor because public ATMTemplate similar to public abstract class ATMTemplate 
		this.BankName=BankName;//BankName=ABNBB when called
		this.accountNumber=accountNumber;
	}
	
	//regular method
	void wishCustomer() {
		System.out.println("Welcome to the "+BankName+" ATM...");//takes BankName=ABNBB 
	}
	
	//abstract method doesn't have body
	abstract void balanceEnquiry();
	abstract void withdrawAmount();
	abstract void miniStatement();
	abstract void transfer();
	

}
