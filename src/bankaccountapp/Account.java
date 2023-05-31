package bankaccountapp;

public abstract class Account implements IBaseRate {//We don't want to create Objects from Account Class=> makes it abstract
	//List common properties for savings and checking accounts
	
	//Constructor to set base properties and initialize the account
	public Account (String name) {
		System.out.println("NAME: " + name);
		System.out.println("NEW ACCOUNT: ");
		
	}
	
	//List common methods
}
