package entities;

public class Account {
	
	private int number;
	private String name;
	public double balance;
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Account(int number, String name, double initialDeposit) {
		this.name = name;
		this.number = number;
		deposit(initialDeposit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	// DEPÓSITO
	public void deposit(double amount) {
		balance += amount;
	}
	
	// SAQUE
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	//TO STRING
	public String toString() {
		return "Account " + getNumber() + ", Holder: " + getName() + ", Balance: $" + String.format("%.2f", getBalance());
	}
	
}
