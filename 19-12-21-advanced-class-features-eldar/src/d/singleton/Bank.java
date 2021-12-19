package d.singleton;

public class Bank {
	
	// 1. private CTOR
	private Bank() {
	}
	// 2. private static instance of Bank
	private static Bank instance = new Bank();
	
	// 3. public static getter for the Bank instance
	public static Bank getInstance() {
		return instance;
	}
	
	
	//====== bank business logic===========
	private int numberOfCustomers;
	
	public void addCustomer() {
		numberOfCustomers++;
	}
	public void removeCustomer() {
		numberOfCustomers--;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	
	

}
