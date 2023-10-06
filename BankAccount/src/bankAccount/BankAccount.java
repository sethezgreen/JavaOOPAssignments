package bankAccount;
import java.util.Random;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private long accountNumber;
	private static int accounts;
	private static double totalMoney;
	
	// Constructor
	public BankAccount(double checkingBalance, double savingsBalance) {
		super();
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		this.accountNumber = this.generateAccountNumber();
		BankAccount.accounts += 2;
		BankAccount.totalMoney += checkingBalance + savingsBalance;
	}


	// Getters
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public static int getAccounts() {
		return accounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}
	
	// Methods
	
	// deposit - allow users to deposit money into checking or saving acc
	public void depositSavings(int money) {
		this.savingsBalance += money;
		BankAccount.totalMoney += money;
	}
	public void depositChecking(int money) {
		this.checkingBalance += money;
		BankAccount.totalMoney += money;
	}
	
	// withdraw
	public void withdrawSavings(int money) {
		if (this.getSavingsBalance() - money > 0) {
			this.savingsBalance -= money;
			BankAccount.totalMoney -= money;
		}
		else {
			System.out.println("Not enough funds!");
		}
	}
	public void withdrawChecking(int money) {
		if (this.getCheckingBalance() - money > 0) {
			this.checkingBalance -= money;
			BankAccount.totalMoney -= money;	
		}
		else {
			System.out.println("Not enough funds!");
		}
	}
	
	// get balance -- display total balance
	public double getBalance() {
		double totalBalance = this.getCheckingBalance() + this.getSavingsBalance();
		return totalBalance;
	}
	
	// account number method
	Random randMachine = new Random();
	private long generateAccountNumber() {
		// could only figure out how to generate a 9 digit number
		long accountNumber = randMachine.nextLong(900000000) + 100000000;
		return accountNumber;
	}
	
}
