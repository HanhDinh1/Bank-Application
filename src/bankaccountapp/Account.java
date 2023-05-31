package bankaccountapp;

public abstract class Account implements IBaseRate {//We don't want to create Objects from Account Class=> makes it abstract
	//List common properties for savings and checking accounts
	String name;
	String sSN;
	double balance;
	
	String accountNumber;
	double rate;
	
	//Constructor to set base properties and initialize the account
	public Account (String name,  String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		System.out.println("NAME: " + name + "sSN: " + sSN + "BALANCE: " + balance);
		
	}
	
	//List common methods
}
