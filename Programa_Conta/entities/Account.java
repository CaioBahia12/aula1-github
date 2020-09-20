package entities;

public class Account {
	private int numberAccount;
	private String holder;
	private double valueAccount;
	
	
	public Account(int numberAccount, String holder) {
		this.numberAccount = numberAccount;
		this.holder = holder;
	}

	public Account(int numberAccount, String holder, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getName() {
		return holder;
	}

	public void setName(String holder) {
		this.holder = holder;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public double getValueAccount() {
		return valueAccount;
	}

	
	public double deposit(double amount) {
		return valueAccount += amount;
	}
	
	public double withdraw(double amount) {
		return valueAccount -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
		+ numberAccount
		+ ", Holder: "
		+ holder
		+ ", Balance: $ "
		+ String.format("%.2f", valueAccount);
		}
}

