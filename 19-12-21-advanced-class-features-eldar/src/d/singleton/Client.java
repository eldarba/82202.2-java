package d.singleton;

public class Client {

	private double balance;

	public void deposit(double amount) {
		balance += amount;
		double commission = amount * 0.05;
		Bank.getInstance().transferMony(commission);
	}

}
