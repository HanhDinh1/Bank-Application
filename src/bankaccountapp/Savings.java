package bankaccountapp;

public class Savings extends Account {
	//List properties specific to a Savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//Constructor to initialize savings account properties
	public Savings (String name,  String sSN, double initDeposit) {
		super (name, sSN, initDeposit);
		System.out.println("NEW SAVINGS ACCOUNT");

	}
	//List any methods specific to savings account
}
