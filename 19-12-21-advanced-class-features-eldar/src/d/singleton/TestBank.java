package d.singleton;

public class TestBank {

	public static void main(String[] args) {

		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		Bank bank3 = Bank.getInstance();
		
		// Bank bank4 = new Bank();

		bank1.addCustomer();
		bank1.addCustomer();
		bank1.addCustomer();

		bank2.removeCustomer();

		System.out.println(bank3.getNumberOfCustomers());

		System.out.println("Bank balance: " + Bank.getInstance().getBalance());

		Client cl1 = new Client();
		Client cl2 = new Client();

		cl1.deposit(100);
		System.out.println("Bank balance: " + Bank.getInstance().getBalance());
		cl2.deposit(2500);

		System.out.println("Bank balance: " + Bank.getInstance().getBalance());

	}

}
